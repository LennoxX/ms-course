package com.udemy.ms.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.ms.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

	
}
