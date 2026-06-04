package com.avirex.loanservice.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
@Entity
@Table(name="loans")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Loan {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long loanId;
	
	private String customerName;
	
	private Double loanAmount;
	
	private String status;
	
	private LocalDateTime createdAt;
	
	
}
