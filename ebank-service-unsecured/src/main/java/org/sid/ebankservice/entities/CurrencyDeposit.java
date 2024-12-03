package org.sid.ebankservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class CurrencyDeposit {
    @Id
    private String currencyId;
    private double saleCurrencyPrice;
    private double purchaseCurrencyPrice;
    private double balance;
    @OneToMany(mappedBy = "currencyDeposit")
    private List<CurrencyTransaction> currencyTransactions;
}
