package com.bankdemo.repository;

import com.bankdemo.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
    Account findAccountByUserId(Long userId);
    Account findAccountByIban(String iban);
    boolean existsByIban(String iban);
    boolean existsByAccountNumber(String accountNumber);
}
