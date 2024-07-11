package com.practice.jpa.solidprinciples.srp;

import java.util.ArrayList;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        String name = "Sukumar";
        GenerateId generateId = new GenerateId();
        Employee employee = new Employee(Math.abs(generateId.generateId(name)),name);
        System.out.println(employee);

        PrintEmployees printEmployees = new PrintEmployees();

        printEmployees.printEmployees(Arrays.asList(employee));
    }
}
