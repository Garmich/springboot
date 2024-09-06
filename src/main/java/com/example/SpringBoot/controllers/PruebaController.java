package com.example.SpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello, World3!";
    }

//  endpoint con diferentes rutas
    @GetMapping({"/hm", "/hola"})
    public String holaWorld(){
        return "Hola, Mundo!";
    }

    @GetMapping({"/saludo/{name}", "/gretting/{name}"})
    public String gretting(@PathVariable("name") String name) {
        return "Hola, " + name;
    }
}
