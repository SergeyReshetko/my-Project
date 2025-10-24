package org.example;

import org.example.util.StringUtil;

public class Main {
    public static void main(String[] args) {
        String input = "J@va the be$t!123";
        StringUtil moveString = new StringUtil();
        String output = moveString.reverseLetters(input);
        System.out.println(output);
    }
}