package com.practice.jpa.OnetoManyMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OneToManyMappingService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private PassportRepository passportRepository;

    @PostConstruct
    public void createStudent() throws JsonProcessingException {

//        Student student = new Student();
//        student.setName("Sukumar");
//        studentRepository.save(student);
//
//        Passport passport = new Passport();
//        passport.setPassportNo("1234A");
//        passport.setStudent(student);
//        passportRepository.save(passport);

//       Optional<Student> student = studentRepository.findById(1);
//       Passport passport = student.get().getPassport();
//
//       System.out.println(new ObjectMapper().writeValueAsString(student));
//       System.out.println(new ObjectMapper().writeValueAsString(passport));

//        Student student = new Student();
//        student.setName("Sukumar");
//
//        Set<Passport> passports = new HashSet<>();
//        Passport p1 = new Passport();
//        p1.setPassportNo("1234");
//        passports.add(p1);
//        Passport p2 = new Passport();
//        p2.setPassportNo("5678");
//        passports.add(p2);
//
//        student.setPassports(passports);
//
//        studentRepository.save(student);


        Optional<Student> student1 = studentRepository.findById(1);
        System.out.println(new ObjectMapper().writeValueAsString(student1.get()));


    }
}
