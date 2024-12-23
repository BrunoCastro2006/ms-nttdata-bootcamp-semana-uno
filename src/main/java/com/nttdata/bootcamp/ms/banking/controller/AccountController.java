package com.nttdata.bootcamp.ms.banking.controller;

import com.nttdata.bootcamp.ms.banking.entity.Account;
import com.nttdata.bootcamp.ms.banking.entity.Client;
import com.nttdata.bootcamp.ms.banking.model.response.ApiResponse;
import com.nttdata.bootcamp.ms.banking.service.AccountService;
import com.nttdata.bootcamp.ms.banking.utility.ConstantUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;


    // Endpoint para crear o actualizar una cuenta bancaria
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Account> createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    // Endpoint para obtener una cuenta por su número de cuenta
    @GetMapping("/{accountNumber}")
    public Mono<Account> getAccountByNumber(@PathVariable String accountNumber) {
        return accountService.getAccountByNumber(accountNumber);
    }

    // Endpoint para eliminar una cuenta por su ID
    @DeleteMapping("/{accountId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> deleteAccountById(@PathVariable String accountId) {
        return accountService.deleteAccountById(accountId);
    }
}


