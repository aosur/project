package com.nttdata.project.api;

import com.nttdata.project.model.document.Account;
import com.nttdata.project.model.request.AccountRequest;
import com.nttdata.project.model.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/v1/accounts")
@AllArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @GetMapping
    public Flux<Account> getAll() {
        return accountService.getAll();
    }

    @PostMapping
    public Mono<Account> register(@RequestBody AccountRequest accountRequest) {
        return accountService.save(accountRequest.getAccount());
    }

    @GetMapping(path = "/{id}")
    public Mono<Account> getById(@PathVariable("id") String id) {
        return accountService.findById(id);
    }
}
