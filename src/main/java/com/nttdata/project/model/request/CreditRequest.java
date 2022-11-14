package com.nttdata.project.model.request;

import com.nttdata.project.model.document.Credit;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CreditRequest {

    private final Credit credit;
}
