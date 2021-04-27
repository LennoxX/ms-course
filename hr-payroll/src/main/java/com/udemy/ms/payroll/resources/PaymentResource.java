package com.udemy.ms.payroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.ms.payroll.entities.Payment;
import com.udemy.ms.payroll.services.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentResource {

	@Autowired
	private PaymentService service;

	@GetMapping(value="{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable int days) {
		return ResponseEntity.ok(service.getPayment(workerId, days));
	}
}
