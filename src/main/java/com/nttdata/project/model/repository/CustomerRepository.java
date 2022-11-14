package com.nttdata.project.model.repository;

import com.nttdata.project.model.document.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {
}
