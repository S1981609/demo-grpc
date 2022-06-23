package com.dissertation.grpc.server.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.dissertation.grpc.server.AssignTeamRequestgRPC;
import com.dissertation.grpc.server.AssignTeamResponsegRPC;
import com.dissertation.grpc.server.TeamDetailsgRPC;
import com.dissertation.grpc.server.entity.Students;
import com.dissertation.grpc.server.entity.TeamDetails;
import com.dissertation.grpc.server.repository.StudentsRepository;
import com.dissertation.grpc.server.repository.TeamDetailsRepository;

import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.MeterRegistry;

@Service
public class TeammateAllocationService {
	@Autowired
	StudentsRepository userRepository;

	@Autowired
	TeamDetailsRepository teamDetailsRepository;

	public AssignTeamResponsegRPC allocateTeamMate(AssignTeamRequestgRPC request) {
		AssignTeamResponsegRPC assignTeamResponse;
		// System.out.println("Hellooo!! Entering the allocateTeamMate Method");
		List<Students> userList = userRepository.findAll();
		// System.out.println("User List Retrieved: " + userList);
		List<Students> requestingStudent = userList.stream().filter(user -> user.getId() == request.getId())
				.collect(Collectors.toList());
		if (requestingStudent.size() == 1) {
			Collection<Students> filteredUserCollection = userList.stream()
					.filter(user -> user.getId() != request.getId()).collect(Collectors.toList());
			List<Students> filteredUserList = new ArrayList<Students>(filteredUserCollection);
			Random rand = new Random();
			Students teamMate = filteredUserList.get(rand.nextInt(filteredUserList.size()));
			Students requestor = requestingStudent.get(0);
			if (teamMate != null && requestor != null) {
				TeamDetails teamDetails = new TeamDetails();
				teamDetails.setMember1(requestor.getName());
				teamDetails.setMember2(teamMate.getName());
				teamDetails.setMember1id(requestor.getId());
				teamDetails.setMember2id(teamMate.getId());
				if (request.getCourseCode() != null && (!request.getCourseCode().equals(""))) {
					teamDetails.setCourseCode(request.getCourseCode());
					try {
						teamDetailsRepository.saveAndFlush(teamDetails);
						TeamDetailsgRPC teamDetailsgRPC=TeamDetailsgRPC.newBuilder().setCourseCode(teamDetails.getCourseCode())
								.setGroupId(teamDetails.getGroupId()).setMember1(teamDetails.getMember1())
								.setMember1Id(teamDetails.getMember1id()).setMember2(teamDetails.getMember2())
								.setMember2Id(teamDetails.getMember2id()).build();
						assignTeamResponse = AssignTeamResponsegRPC.newBuilder().setMessage("You have been successfully allocated a team")
								.setTeamDetails(teamDetailsgRPC).build();

					} catch (Exception e) {
					assignTeamResponse = AssignTeamResponsegRPC.newBuilder().setMessage("An exception occured while updating your team details: " + e).build();
					}
				} else {
					assignTeamResponse = AssignTeamResponsegRPC.newBuilder().setMessage("Please help to specify the course code for which you wish to form a team").build();
				}
			} else {
				assignTeamResponse = AssignTeamResponsegRPC.newBuilder().setMessage("Sorry, your details or your team mate's details are not available in the system").build();
			}
		} else {
			assignTeamResponse = AssignTeamResponsegRPC.newBuilder().setMessage("Sorry, your details are not available in the system").build();
		}
		return assignTeamResponse;

	}

}
