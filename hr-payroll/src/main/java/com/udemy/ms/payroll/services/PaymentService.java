package com.udemy.ms.payroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.ms.payroll.entities.Payment;
import com.udemy.ms.payroll.entities.Worker;
import com.udemy.ms.payroll.interfaces.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient feignClient;
	
	public Payment getPayment(long workerId, int days) {
		Worker worker = feignClient.getById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
