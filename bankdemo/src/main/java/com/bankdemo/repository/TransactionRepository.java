package com.bankdemo.repository;

import com.bankdemo.model.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {
    Iterable<Transaction> findTransactionBySourceAccountIban(String sourceAccountIban);

    Iterable<Transaction> findTransactionByTargetAccountIban(String targetAccountIban);
}
