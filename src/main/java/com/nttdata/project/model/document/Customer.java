package com.nttdata.project.model.document;

import com.nttdata.project.model.util.CustomerType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "customers")
public class Customer {
    @Id
    private String id;
    private String customerNumber;
    private String dniRuc;
    private String name;
    private CustomerType customerType;
    private BigDecimal creditLimit;
    private List<Account> accounts;
}
