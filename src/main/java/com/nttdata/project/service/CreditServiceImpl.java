package com.nttdata.project.service;

import com.nttdata.project.model.document.Credit;
import com.nttdata.project.model.repository.CreditRepository;
import com.nttdata.project.model.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CreditServiceImpl implements CreditService {

    private final CreditRepository creditRepository;

    @Autowired
    public CreditServiceImpl(CreditRepository creditRepository) {
        this.creditRepository = creditRepository;
    }

    @Override
    public Flux<Credit> getAll() {
        return creditRepository.findAll();
    }

    @Override
    public Mono<Credit> save(Credit credit) {
        return creditRepository.save(credit);
    }

    @Override
    public Mono<Credit> findById(String id) {
        return creditRepository.findById(id);
    }

    @Override
    public Mono<Boolean> existsById(String id) {
        return creditRepository.existsById(id);
    }
}
