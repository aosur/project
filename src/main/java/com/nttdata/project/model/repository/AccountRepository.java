package com.nttdata.project.model.repository;

import com.nttdata.project.model.document.Account;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AccountRepository extends ReactiveMongoRepository<Account, String> {
}
