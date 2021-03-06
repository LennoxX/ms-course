package com.udemy.ms.worker.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.ms.worker.entities.Worker;
import com.udemy.ms.worker.repositories.WorkerRepository;

@RestController
@RequestMapping("/workers")
public class WorkerResource {
	
	private static Logger logger = LoggerFactory.getLogger(WorkerResource.class);

	@Autowired
	private WorkerRepository repository;
	
	@Autowired
	private Environment env;

	@GetMapping
	public ResponseEntity<List<Worker>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping(value="{id}")
	public ResponseEntity<Worker> getById(@PathVariable Long id) {
		
		logger.info("PORT: " + env.getProperty("local.server.port"));
		
		return ResponseEntity.ok(repository.findById(id).get());
	}
}
