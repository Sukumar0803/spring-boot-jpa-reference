package com.practice.jpa.onetoonemapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OneToOneMappingExample {

    @Autowired
    AadharRepository aadharRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    @PostConstruct
    public void test() throws JsonProcessingException {
//        Aadhar aadhar = new Aadhar();
//        aadhar.setAadharNumber("111AAA00988");
//        aadharRepository.save(aadhar);
//
//        Employee employee = new Employee();
//        employee.setAadhar(aadhar);
//        employee.setName("Sukumar");
//        employeeRepository.save(employee);

        Optional<Employee> employee = employeeRepository.findById(1);
        System.out.println(new ObjectMapper().writeValueAsString(employee.get()));

    }
}
