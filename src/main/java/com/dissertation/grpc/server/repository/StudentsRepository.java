package com.dissertation.grpc.server.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dissertation.grpc.server.entity.Students;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Integer> {
	List<Students> findAll();

}
