package org.sid.walletservice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Wallet {
    @Id
    private String id;
    private long createdAt;
    private String userId;
    private double balance;
    @ManyToOne
    private Currency currency;
    @OneToMany(mappedBy = "wallet")
    private List<WalletTransaction> walletTransactions;
}
