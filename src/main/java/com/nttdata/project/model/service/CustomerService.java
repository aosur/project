package com.nttdata.project.model.service;

import com.nttdata.project.model.document.Account;
import com.nttdata.project.model.document.Customer;
import com.nttdata.project.model.request.AccountRequest;
import com.nttdata.project.model.request.CustomerRequest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerService {

    Flux<Customer> getAll();
    Mono<Customer> save(Customer customer);
    Mono<Customer> findById(String id);
    Mono<Boolean> existsById(String id);
    Mono<Void> deleteById(String id);
    Mono<Customer> update(String id, CustomerRequest request);
}
