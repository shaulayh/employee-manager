package com.shaulayh.datalearning.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Application to test spring data and jpa
 *
 * @author Azeez G. Shola
 * @version 1.0
 */

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String role;

    @ManyToOne
    private Manager manager;


    private Employee() {
    }

    public Employee(String name, String role, Manager manager) {
        this.name = name;
        this.role = role;
        this.manager = manager;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}
