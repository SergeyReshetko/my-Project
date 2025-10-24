package com.urise.webapp.org.example.util;

public class StringUtil {

    public String reverseLetters(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        char[] output = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (Character.isLetter(output[start]) && Character.isLetter(output[end])) {
                char temp = output[start];
                output[start] = output[end];
                output[end] = temp;
                start++;
                end--;
            } else if (!Character.isLetter(output[start])) {
                start++;
            } else {
                end--;
            }
        }
        return new String(output);
    }
}