package com.nttdata.project.service;

import com.nttdata.project.model.document.Account;
import com.nttdata.project.model.repository.AccountRepository;
import com.nttdata.project.model.request.AccountRequest;
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

    @Override
    public Mono<Void> deleteById(String id) {
        return accountRepository.deleteById(id);
    }

    @Override
    public Mono<Account> update(String id, AccountRequest request) {
        return accountRepository.findById(id)
                .flatMap(customerDB -> {
                    request.getAccount().setId(id);
                    return accountRepository.save(request.getAccount());
                }).switchIfEmpty(Mono.defer(() -> {
                            // TODO poner logs
                            return Mono.error(
                                    new IllegalStateException("Account does not exist"));
                        }
                ));
    }
}
