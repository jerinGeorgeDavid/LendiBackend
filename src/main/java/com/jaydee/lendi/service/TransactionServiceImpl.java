package com.jaydee.lendi.service;

import com.jaydee.lendi.entity.Transaction;
import com.jaydee.lendi.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionRepository txRepository;
    @Override
    public Transaction saveTransaction(Transaction tx) {
        System.out.println("in service");
        return txRepository.save(tx);
    }

    @Override
    public Optional<Transaction> fetchTransaction(long id) {
        return txRepository.findById(id);
    }

    @Override
    public List<Transaction> fetchAllTransactions() {
        return txRepository.findAll();
    }
}
