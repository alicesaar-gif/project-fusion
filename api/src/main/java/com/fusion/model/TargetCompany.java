package com.fusion.model;

import jakarta.persistence.*;

@Entity
@Table(name = "target_companies")
public class TargetCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "setor")
    private String sector;

    @Column(name = "valuation")
    private Double valuation;

    // Getters e Setters (Necessários para o Java ler os dados)
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getSector() { return sector; }
    public Double getValuation() { return valuation; }
}