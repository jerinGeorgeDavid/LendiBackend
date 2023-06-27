package com.jaydee.lendi.service;

import com.jaydee.lendi.entity.Transaction;

import java.util.List;
import java.util.Optional;

public interface TransactionService {

    public Transaction saveTransaction(Transaction tx);
    public Optional<Transaction> fetchTransaction(long id);
    public List<Transaction> fetchAllTransactions();
}
