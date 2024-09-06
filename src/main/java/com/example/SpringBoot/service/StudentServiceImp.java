package com.example.SpringBoot.service;

import com.example.SpringBoot.model.Student;
import net.datafaker.Faker;

public class StudentServiceImp implements StudentService{

    private final Faker faker = new Faker();

    @Override
    public Student getStudent() {
        return new Student(faker.idNumber(),
                           faker.name().fullName(),
                           faker.internet().emailAddress(),
                           faker.number().numberBetween(16, 60),
                           faker.educator().course());
    }
}
