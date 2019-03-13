package com.shaulayh.datalearning.repositories;

import com.shaulayh.datalearning.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

/**
 * Application to test spring data and jpa
 *
 * @author Azeez G. Shola
 * @version 1.0
 */

@RepositoryRestResource
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findByName(@Param("q") String name);

    List<Employee> findByRole(@Param("q") String role);

    List<Employee> findByManager_Id(@Param("q") Long Id);

    @Override
    Optional<Employee> findById(Long aLong);
}
