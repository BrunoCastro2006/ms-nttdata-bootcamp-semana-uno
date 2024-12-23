package com.nttdata.bootcamp.ms.banking.controller;

import com.nttdata.bootcamp.ms.banking.entity.Account;
import com.nttdata.bootcamp.ms.banking.entity.Client;
import com.nttdata.bootcamp.ms.banking.model.response.ApiResponse;
import com.nttdata.bootcamp.ms.banking.service.ClientService;
import com.nttdata.bootcamp.ms.banking.utility.ConstantUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    // Endpoint para crear o actualizar un cliente
    @PostMapping
    public Mono<Client> createClient(@RequestBody Client client) {
        return clientService.createClient(client);
    }

    // Endpoint para obtener una cuenta por su email
    @GetMapping("/{email}")
    public Mono<Client> getClientByEmail(@PathVariable String email) {
        return clientService.getClientByEmail(email);
    }

    // Endpoint para eliminar un cliente por su ID
    @DeleteMapping("/{clientId}")
    public Mono<Void> deleteClientById(@PathVariable String clientId) {
        return clientService.deleteClientById(clientId);
    }
}
