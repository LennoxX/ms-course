package com.udemy.ms.payroll.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.udemy.ms.payroll.entities.Worker;

@Component
@FeignClient(name="hr-worker", url = "localhost:8081", path = "/workers")
public interface WorkerFeignClient {

	@GetMapping(value="{id}")
	ResponseEntity<Worker> getById(@PathVariable Long id);
}
