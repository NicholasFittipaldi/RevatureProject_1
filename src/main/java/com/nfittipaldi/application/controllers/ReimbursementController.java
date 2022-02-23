package com.nfittipaldi.application.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nfittipaldi.application.models.Reimbursement;
import com.nfittipaldi.application.repositories.ReimbursementRepository;

@RestController
@RequestMapping("/api/v1/reimbursementController/")
public class ReimbursementController {
	
	@Autowired
	private ReimbursementRepository reimbursementRepository;
	
	@GetMapping("/reimbursements")
	public List<Reimbursement> getAllReimbursements() {
		return reimbursementRepository.findAll();
	}
}
