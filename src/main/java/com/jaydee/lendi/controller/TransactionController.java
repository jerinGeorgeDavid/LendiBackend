package com.jaydee.lendi.controller;

import com.jaydee.lendi.entity.Transaction;
import com.jaydee.lendi.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TransactionController {

    @Autowired
    TransactionService txService;

    @PostMapping("/createTransaction")
    public Transaction createTransaction(@RequestBody Transaction inputTx){
        System.out.println("in controller");
        return txService.saveTransaction(inputTx);
    }

    @GetMapping("/getTransaction")
    public Optional<Transaction> getTransaction(@RequestParam(value = "id") Long inputId){
        System.out.println("input id : "+inputId);
        return txService.fetchTransaction(inputId);
    }

    @GetMapping("/getAllTransactions")
    public List<Transaction> getAllTransactions(){
        return txService.fetchAllTransactions();
    }
}