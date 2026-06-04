package com.avirex.loanservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @GetMapping("/test")
    public String test() {
        return "Loan Service Running";
    }
}