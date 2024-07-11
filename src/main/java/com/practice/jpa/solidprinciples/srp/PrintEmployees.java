package com.practice.jpa.solidprinciples.srp;

import java.util.List;

public class PrintEmployees {

    public void printEmployees(List<Employee> employees) {
        System.out.println("Printing employees.........");
        employees.forEach(System.out::println);
    }
}
