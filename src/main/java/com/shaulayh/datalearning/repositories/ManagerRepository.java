package com.shaulayh.datalearning.repositories;

import com.shaulayh.datalearning.model.Manager;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Application to test spring data and jpa
 *
 * @author Azeez G. Shola
 * @version 1.0
 *
 */

@RepositoryRestResource()
public interface ManagerRepository extends CrudRepository<Manager, Long> {

    List<Manager> findByEmployeesRoleContains(@Param("q") String role);

    List<Manager> findByEmployeesName(@Param("q") String name);
}
