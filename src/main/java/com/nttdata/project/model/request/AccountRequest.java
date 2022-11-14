package com.nttdata.project.model.request;

import com.nttdata.project.model.document.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AccountRequest {

    private final Account account;
}
