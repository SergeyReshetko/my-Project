package org.example.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {
    private final StringUtil textUtil = new StringUtil();
    
    // Проверяем результат на выполнение функции
    @Test
    void testReverseLetters() {
        String testText = "J@va the be$t!123";
        String result = textUtil.reverseLetters(testText);
        assertEquals("t@eb eht av$J!123", result);
    }
    
    // Проверяем на входную пустую строку
    @Test
    void testReverseLettersEmpty() {
        String testText = "";
        String result = textUtil.reverseLetters(testText);
        assertEquals("", result);
    }
    
    // Проверяем на входной null ожидаем пустую строку
    @Test
    void testReverseLettersNull() {
        String result = textUtil.reverseLetters(null);
        assertNotNull(result);
    }
    
    // Проверяем длину входной сроки
    @Test
    void testReverseLettersLength() {
        String testText = "J@va the be$t!123";
        String result = textUtil.reverseLetters(testText);
        assertEquals(testText.length(), result.length());
    }
    
    // Проверяем выполнение метода по последнему буквенному символу входных данных
    @Test
    void testReverseLettersLastSimbol() {
        String testText = "J@va the be$t!123";
        String result = textUtil.reverseLetters(testText);
        char lastLetterText = ' ';
        
        for (int i = testText.length() - 1; i >= 0; i--) {
            char temp = testText.charAt(i);
            if (Character.isLetter(temp)) {
                lastLetterText = temp;
                break;
            }
        }
        assertEquals(lastLetterText, result.charAt(0));
    }
    
    // Проверяем выполнение метода по первому буквенному символу входных данных
    @Test
    void testReverseLettersFirstSimbol() {
        String testText = "J@va the be$t!123";
        String result = textUtil.reverseLetters(testText);
        int indexLastLetterText = 0;
        
        for (int i = result.length() - 1; i >= 0; i--) {
            char temp = result.charAt(i);
            if (Character.isLetter(temp)) {
                indexLastLetterText = i;
                break;
            }
        }
        assertEquals(testText.charAt(0), result.charAt(indexLastLetterText));
    }
}