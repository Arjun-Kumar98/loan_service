package com.avirex.loanservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.avirex.loanservice.entity.Loan;

public interface LoanRepository extends JpaRepository<Loan,Long> {

}
