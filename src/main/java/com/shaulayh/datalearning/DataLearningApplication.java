package com.shaulayh.datalearning;


import com.shaulayh.datalearning.model.Employee;
import com.shaulayh.datalearning.model.Manager;
import com.shaulayh.datalearning.repositories.EmployeeRepository;
import com.shaulayh.datalearning.repositories.ManagerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Application to test spring data and jpa
 *
 * @author Azeez G. Shola
 * @version 1.0
 *
 */


@SpringBootApplication
public class DataLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataLearningApplication.class, args);
    }


    @Bean
    CommandLineRunner initData(EmployeeRepository employeeRepository,
                               ManagerRepository managerRepository) {
        return args -> {

            Manager manager = new Manager("Azeez");

            managerRepository.save(manager);
            Manager manager1 = managerRepository.save(new Manager("Ewa"));

            employeeRepository.save(new Employee("gafar", "admin", manager));
            employeeRepository.save(new Employee("maraim", "student", manager));
            employeeRepository.save(new Employee("jubril", "student", manager));
            employeeRepository.save(new Employee("Fabian", "student", manager1));
            employeeRepository.save(new Employee("Fabian", "admin", manager1));
        };
    }
}
