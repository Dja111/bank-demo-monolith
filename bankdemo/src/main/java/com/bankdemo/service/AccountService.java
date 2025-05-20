package com.bankdemo.service;

import com.bankdemo.model.Account;

public interface AccountService {
    Account createAccount(Long userId);

    Account getAccountById(Long id);

    Account getAccountByUserId(Long userId);

    Account getAccountByIban (String iban);

    Account updateAccount (Account account);
}
