package com.dissertation.grpc.server.grpc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.dissertation.grpc.server.AssignTeamMateGrpc.AssignTeamMateImplBase;
import com.dissertation.grpc.server.AssignTeamRequestgRPC;
import com.dissertation.grpc.server.AssignTeamResponsegRPC;
import com.dissertation.grpc.server.service.TeammateAllocationService;

import io.grpc.stub.StreamObserver;
import io.micrometer.core.annotation.Timed;
import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.MeterRegistry;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class AssignTeamMateImpl extends AssignTeamMateImplBase {
	@Autowired
	TeammateAllocationService teamMateAllocationService;
	@Override
	 @Timed(value = "assignTeamMate.time.grpc", description = "Time taken to return team details")
	public void assignTeamMate(AssignTeamRequestgRPC request, StreamObserver<AssignTeamResponsegRPC> responseObserver) {

		String greeting = new StringBuilder().append("Hello, ").append(request.getName()).append(" !").toString();
		AssignTeamResponsegRPC assignTeamResponse = teamMateAllocationService.allocateTeamMate(request);		
		responseObserver.onNext(assignTeamResponse);
		responseObserver.onCompleted();
	}
	
}
