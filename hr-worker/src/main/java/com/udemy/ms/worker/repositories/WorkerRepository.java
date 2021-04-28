package com.udemy.ms.worker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.ms.worker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

	
}
