package com.avirex.loanservice.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.avirex.loanservice.entity.Loan;
import com.avirex.loanservice.repository.LoanRepository;

@Service
public class LoanService {
	
	private final LoanRepository loanRepository;
	
	public LoanService(LoanRepository loanRepository) {
		this.loanRepository = loanRepository;
	}
	

	public Loan createLoan(Loan loan) {     
	     loan.setStatus("hey all good");
		return loanRepository.save(loan);
	}

}
