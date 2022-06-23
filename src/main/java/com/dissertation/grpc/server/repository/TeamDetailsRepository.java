package com.dissertation.grpc.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dissertation.grpc.server.entity.Students;
import com.dissertation.grpc.server.entity.TeamDetails;

@Repository
public interface TeamDetailsRepository  extends JpaRepository<TeamDetails, Integer>{

}
