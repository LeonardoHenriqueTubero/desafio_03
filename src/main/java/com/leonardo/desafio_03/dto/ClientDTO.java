package com.leonardo.desafio_03.dto;

import com.leonardo.desafio_03.entities.Client;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;
    private String name;
    private String CPF;
    private Double income;
    private LocalDate birthDate;
    private Integer children;

    public ClientDTO() {}

    public ClientDTO(Long id, String name, String CPF, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.CPF = CPF;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        CPF = entity.getCPF();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCPF() {
        return CPF;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}
