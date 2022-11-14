package com.nttdata.project.model.document;

import com.nttdata.project.model.util.AccountType;
import com.nttdata.project.model.util.Movement;
import com.nttdata.project.model.util.Person;
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
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "accounts")
public class Account {
    @Id
    private String id;
    private String accountNumber;
    private BigDecimal amount;
    private Customer customer;
    private AccountType accountType;
    private List<Customer> owners;  // Titulares
    private List<Person> signatories;   // Firmantes
    private List<Movement> movements;
}
