package com.nttdata.project.model.service;

import com.nttdata.project.model.document.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerService {

    Flux<Customer> getAll();
    Mono<Customer> save(Customer customer);
    Mono<Customer> findById(String id);
    Mono<Boolean> existsById(String id);
}
