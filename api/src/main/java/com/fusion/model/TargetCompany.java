package com.fusion.model;

import jakarta.persistence.*;

@Entity
@Table(name = "target_companies")
public class TargetCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String sector;
    private Double valuation;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSector() { return sector; }
    public void setSector(String sector) { this.sector = sector; }

    public Double getValuation() { return valuation; }
    public void setValuation(Double valuation) { this.valuation = valuation; }
}