package com.udemy.ms.payroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.udemy.ms.payroll.entities.Payment;
import com.udemy.ms.payroll.entities.Worker;

@Service
public class PaymentService {
	
	@Value("${hr-worker.host}")
	private String workerHost;

	@Autowired
	private RestTemplate restTemplate;
	
	public Payment getPayment(long workerId, int days) {
		Map<String, String> params = 	new HashMap<>();
		
		params.put("id", String.valueOf(workerId));
		Worker worker = restTemplate.getForObject(workerHost + "workers/{id}", Worker.class, params);
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
