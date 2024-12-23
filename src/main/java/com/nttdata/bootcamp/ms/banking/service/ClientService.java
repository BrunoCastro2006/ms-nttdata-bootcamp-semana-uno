package com.nttdata.bootcamp.ms.banking.service;

import com.nttdata.bootcamp.ms.banking.entity.Client;
import reactor.core.publisher.Mono;

public interface ClientService {

    Mono<Client> createClient(Client client);

    Mono<Client> getClientByEmail(String email);

    Mono<Void> deleteClientById(String clientId);
}

