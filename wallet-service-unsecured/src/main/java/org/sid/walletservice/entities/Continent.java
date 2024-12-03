package org.sid.walletservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Continent {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String continentName;
    @OneToMany(mappedBy = "continent")
    private List<Country> countries;

}
