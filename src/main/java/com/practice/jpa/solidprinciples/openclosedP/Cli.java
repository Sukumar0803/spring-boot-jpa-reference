package com.practice.jpa.solidprinciples.openclosedP;

import com.practice.jpa.solidprinciples.srp.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cli {
    public static void main(String[] args) {

        List<Employee> javaEmployees = new ArrayList<Employee>(Arrays.asList(
                new Employee(1, "Sukumar"),
                new Employee(2, "veera")
        ));

        List<Employee> angularEmployees = new ArrayList<Employee>(Arrays.asList(
                new Employee(3, "Anandhan"),
                new Employee(4, "Vishnu")
        ));

        IDisplayDetail displayDetail = new JavaEmployeeDisplay(javaEmployees);
        displayDetail.displayDetail();

        IDisplayDetail angularDisplayDetail = new AngularEmployeeDisplay(angularEmployees);
        angularDisplayDetail.displayDetail();
    }
}
