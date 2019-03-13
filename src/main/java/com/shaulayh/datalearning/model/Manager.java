package com.shaulayh.datalearning.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Application to test spring data and jpa
 *
 * @author Azeez G. Shola
 * @version 1.0
 */

@Data
@Entity
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "manager")
    List<Employee> employees;

    private Manager() {

    }

    public Manager(String name) {
        this.name = name;
    }
}
