package com.nttdata.project.service;

import com.nttdata.project.model.document.Account;
import com.nttdata.project.model.document.Customer;
import com.nttdata.project.model.repository.CustomerRepository;
import com.nttdata.project.model.request.AccountRequest;
import com.nttdata.project.model.request.CustomerRequest;
import com.nttdata.project.model.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Flux<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public Mono<Customer> save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Mono<Customer> findById(String id) {
        return customerRepository.findById(id);
    }

    @Override
    public Mono<Boolean> existsById(String id) {
        return customerRepository.existsById(id);
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return customerRepository.deleteById(id);
    }

    @Override
    public Mono<Customer> update(String id, CustomerRequest request) {
        if (request.getCustomer().getId() == null) {
            throw new IllegalStateException("cannot save " + request);
        }
        return customerRepository.save(request.getCustomer());
    }

}
