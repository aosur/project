package com.nttdata.project.api;

import com.nttdata.project.model.document.Credit;
import com.nttdata.project.model.request.CreditRequest;
import com.nttdata.project.model.service.CreditService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/v1/credits")
@AllArgsConstructor
public class CreditController {

    private final CreditService creditService;

    @GetMapping
    public Flux<Credit> getAll() {
        return creditService.getAll();
    }

    @PostMapping
    public Mono<Credit> register(@RequestBody CreditRequest creditRequest) {
        return creditService.save(creditRequest.getCredit());
    }

    @GetMapping(path = "/{id}")
    public Mono<Credit> getById(@PathVariable("id") String id) {
        return creditService.findById(id);
    }

}
