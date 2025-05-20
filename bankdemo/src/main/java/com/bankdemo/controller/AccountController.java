package com.bankdemo.controller;

import com.bankdemo.model.Account;
import com.bankdemo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    private final AccountService accountService;

    @Autowired
    AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity<Account> createAccount(
            @RequestParam Long userId) {
        return ResponseEntity.ok(accountService.createAccount(userId));
    }

    @GetMapping
    public ResponseEntity<Account> getAccountByIban(@RequestParam String iban) {
        return ResponseEntity.ok(accountService.getAccountByIban(iban));
    }

    @PutMapping
    public ResponseEntity<Account> updateAccount(@RequestBody Account account) {
        return ResponseEntity.ok(accountService.updateAccount(account));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> getAccount(@PathVariable Long id) {
        return ResponseEntity.ok(accountService.getAccountById(id));
    }

    @GetMapping("/by-user/{userId}")
    public ResponseEntity<Account> getAccountByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(accountService.getAccountByUserId(userId));
    }
}
