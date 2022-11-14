package com.nttdata.project.model.document.customer;

import com.nttdata.project.model.document.account.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Customer {

    private String id;
    private String customerNumber;
    private String dniRuc;
    private String name;
    private List<Account> accounts;
}
