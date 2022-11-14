package com.nttdata.project.model.repository;

import com.nttdata.project.model.document.Credit;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CreditRepository extends ReactiveMongoRepository<Credit, String> {
}
