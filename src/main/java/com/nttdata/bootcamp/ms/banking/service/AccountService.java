package com.nttdata.bootcamp.ms.banking.service;

import com.nttdata.bootcamp.ms.banking.entity.Account;
import com.nttdata.bootcamp.ms.banking.entity.Client;
import reactor.core.publisher.Mono;

public interface AccountService {
    Mono<Account> createAccount(Account account);

    Mono<Account> getAccountByNumber(String accountNumber);

    Mono<Void> deleteAccountById(String accountId);

    Mono<Account> updateAccount(String accountId, Account account);

    Mono<Double> getAccountBalance(String accountId);

    Mono<Account> depositToAccount(String accountId, double amount);

    Mono<Account> withdrawFromAccount(String accountId, double amount);
}




