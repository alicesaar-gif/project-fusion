package com.projectfusion.model;

public class Company {
    private String name;
    private String address;
    private String registrationNumber;
    
    public Company(String name, String address, String registrationNumber) {
        this.name = name;
        this.address = address;
        this.registrationNumber = registrationNumber;
    }
    
    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}