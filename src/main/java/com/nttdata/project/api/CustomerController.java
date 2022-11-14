package com.nttdata.project.api;

import com.nttdata.project.model.document.Customer;
import com.nttdata.project.model.request.CustomerRequest;
import com.nttdata.project.model.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/v1/customers")
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public Flux<Customer> getAll() {
        return customerService.getAll();
    }

    @PostMapping
    public Mono<Customer> register(@RequestBody CustomerRequest customerRequest) {
        return customerService.save(customerRequest.getCustomer());
    }

    @GetMapping(path = "/{id}")
    public Mono<Customer> getById(@PathVariable("id") String id) {
        return customerService.findById(id);
    }
}
