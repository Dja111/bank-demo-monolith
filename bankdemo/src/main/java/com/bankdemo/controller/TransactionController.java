package com.bankdemo.controller;

import com.bankdemo.model.Transaction;
import com.bankdemo.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private TransactionService transactionService;

    @Autowired
    TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction transaction) {
        try {
            Transaction response = transactionService.processTransaction(transaction);
            return ResponseEntity.ok(response);
        }  catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transaction> getTransaction(@PathVariable Long id) {
        return ResponseEntity.ok(transactionService.getTransactionById(id));
    }

    @GetMapping("/sourceAccountIban")
    public ResponseEntity<Iterable<Transaction>> getTransactionBySourceAccountIban(@RequestParam String sourceAccountIban) {
        return ResponseEntity.ok(transactionService.getTransactionBySourceAccountIban(sourceAccountIban));
    }

    @GetMapping("/targetAccountIban")
    public ResponseEntity<Iterable<Transaction>> getTransactionByTargetAccountIban(@RequestParam String targetAccountIban) {
        return ResponseEntity.ok(transactionService.getTransactionByTargetAccountIban(targetAccountIban));
    }
}

