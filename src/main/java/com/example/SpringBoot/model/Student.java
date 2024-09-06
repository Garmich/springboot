package com.example.SpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import net.datafaker.providers.base.IdNumber;

@Getter @Setter @AllArgsConstructor
public class Student {
    private IdNumber id;
    private String name;
    private String email;
    private int age;
    private String course;
}
