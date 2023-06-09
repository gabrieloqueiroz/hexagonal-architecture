package com.queiroz.hexagonal.application.core.domain;

public class Customer {
    private String id;
    private String name;
    private String cpf;
    private boolean validCpf;
    private Address address;

    public Customer(String id, String name, String cpf, boolean validCpf, Address address) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.validCpf = validCpf;
        this.address = address;
    }

    public Customer() {
        this.validCpf = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isValidCpf() {
        return validCpf;
    }

    public void setValidCpf(boolean validCpf) {
        this.validCpf = validCpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
