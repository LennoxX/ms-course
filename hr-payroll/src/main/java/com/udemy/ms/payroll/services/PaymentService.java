package com.udemy.ms.payroll.services;

import org.springframework.stereotype.Service;

import com.udemy.ms.payroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Nome", 100.0, days);
	}
}
