package com.practice.jpa.OnetoManyMapping;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "passport")
@Getter
@Setter
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "passport_number", nullable = false)
    private String passportNo;

    @Column(name = "student_id")
    private Integer studentId;

}
