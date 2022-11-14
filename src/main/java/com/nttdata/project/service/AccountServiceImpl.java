package com.nttdata.project.service;

import com.nttdata.project.model.document.Account;
import com.nttdata.project.model.repository.AccountRepository;
import com.nttdata.project.model.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Flux<Account> getAll() {
        return accountRepository.findAll();
    }

    @Override
    public Mono<Account> save(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Mono<Account> findById(String id) {
        return accountRepository.findById(id);
    }

    @Override
    public Mono<Boolean> existsById(String id) {
        return accountRepository.existsById(id);
    }
}
