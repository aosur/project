package com.nttdata.project.model.request;

import com.nttdata.project.model.document.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CustomerRequest {

    private final Customer customer;
}
