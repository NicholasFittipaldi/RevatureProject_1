package com.nfittipaldi.application.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nfittipaldi.application.models.Reimbursement;
import com.nfittipaldi.application.repositories.ReimbursementRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/reimbursementController/")
public class ReimbursementController {
	
	@Autowired
	private ReimbursementRepository reimbursementRepository;
	
	@GetMapping("/getReimbursement")
	public Reimbursement getReimbursement(@RequestBody long id) {
		return reimbursementRepository.getById(id);
	}
	
	@GetMapping("/getAllReimbursements")
	public List<Reimbursement> getAllReimbursements() {
		return reimbursementRepository.findAll();
	}
	
	@PostMapping("/addReimbursement")
	public Reimbursement addReimbursement(@RequestBody Reimbursement reimbursement) {
		return reimbursementRepository.save(reimbursement);
	}
}
