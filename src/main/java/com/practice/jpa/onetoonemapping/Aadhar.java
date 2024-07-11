package com.practice.jpa.onetoonemapping;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "Aadhar")
@Getter
@Setter
public class Aadhar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "aadhar_number", nullable = false)
    private String aadharNumber;
}