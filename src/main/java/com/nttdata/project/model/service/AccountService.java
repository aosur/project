package com.nttdata.project.model.service;

import com.nttdata.project.model.document.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountService {
    Flux<Account> getAll();
    Mono<Account> save(Account account);
    Mono<Account> findById(String id);
    Mono<Boolean> existsById(String id);
}
