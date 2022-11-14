package com.nttdata.project.model.document;

import com.nttdata.project.model.util.CreditType;
import com.nttdata.project.model.util.Pago;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Document(collection = "credits")
public class Credit {
    @Id
    private String id;
    private String creditNumber;
    private CreditType creditType;
    private BigDecimal amount;
    private Customer customer;
    private List<Pago> pagos;
}
