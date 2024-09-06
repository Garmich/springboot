package com.example.SpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class Customer {

    private Long id;
    private String name;
    private String username;
    private String password;

}
