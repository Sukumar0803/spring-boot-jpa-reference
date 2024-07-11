package com.practice.jpa.solidprinciples.openclosedP;

import com.practice.jpa.solidprinciples.srp.Employee;

import java.util.List;

public class AngularEmployeeDisplay implements IDisplayDetail {

    public List<Employee> employees;

    public AngularEmployeeDisplay(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public void displayDetail() {
        System.out.println("Angular Employee");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
