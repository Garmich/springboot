package com.example.SpringBoot.controllers;

import com.example.SpringBoot.service.PalindromeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PalindromoController {

    @Autowired
    private PalindromeService palindromeService;

    @GetMapping("/palindrome/{word}")
    public String palindrome (@PathVariable String word) {

        String result = palindromeService.checkPalindrome(word) ? " és " : " NO es ";

        return "La palabra " + word + result + "un palindromo";
    }

}