package com.example.SpringBoot.service;

import org.springframework.stereotype.Service;

@Service
public class PalindromeServiceImp implements PalindromeService {

    @Override
    public boolean checkPalindrome(String word) {
        int wordLength = word.length();
        for (int i = 0; i < wordLength / 2; i++) {
            if (!isMirror(word, i, wordLength - i - 1)) return false;
        }

        return true;
    }

    private boolean isMirror(String word, int startIndex, int endIndex) {
        return word.charAt(startIndex) == word.charAt(endIndex);
    }
}
