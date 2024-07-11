package com.practice.jpa.solidprinciples.openclosedP;

import com.practice.jpa.solidprinciples.srp.Employee;

import java.util.ArrayList;
import java.util.List;

public class JavaEmployeeDisplay implements IDisplayDetail {
    private List<Employee> employees;

    public JavaEmployeeDisplay(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public void displayDetail() {
        System.out.println("Java Employee Details");
        employees.forEach(System.out::println);
    }
}
