package com.bankdemo.service;


import com.bankdemo.model.Transaction;

public interface TransactionService {
    Transaction processTransaction(Transaction transaction) throws Exception;

    Transaction getTransactionById(Long id);

    Iterable<Transaction> getTransactionBySourceAccountIban(String sourceAccountIban);

    Iterable<Transaction> getTransactionByTargetAccountIban(String targetAccountIban);
}
