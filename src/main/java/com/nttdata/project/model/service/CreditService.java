package com.nttdata.project.model.service;

import com.nttdata.project.model.document.Credit;
import com.nttdata.project.model.request.CreditRequest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditService {
    Flux<Credit> getAll();
    Mono<Credit> save(Credit credit);
    Mono<Credit> findById(String id);
    Mono<Boolean> existsById(String id);
    Mono<Void> deleteById(String id);
    Mono<Credit> update(String id, CreditRequest request);
}
