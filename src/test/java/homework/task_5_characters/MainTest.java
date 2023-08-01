package homework.task_5_characters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MainTest {

    //1
    @Test
    void testFindSymbolOccurance() {
        String str = "Java";
        char ch = 'a';
        int expectedResult = 2;
        int result = Main.findSymbolOccurance(str, ch);
        assertEquals(expectedResult, result);
    }
    @Test
    void testFindSymbolOccuranceNoSymbol() {
        String str = "Java";
        char ch = 'x';
        int expectedResult = 0;
        int result = Main.findSymbolOccurance(str, ch);
        assertEquals(expectedResult, result);
    }

    //2
    @Test
    void testFindWordPosition() {
        String source = "Apollo";
        String target = "pollo";
        int expectedResult = 1;
        int result = Main.findWordPosition(source, target);
        assertEquals(expectedResult, result);
    }

    @Test
    void testNoFindWordPosition() {
        String source = "Apple";
        String target = "Plant";
        int expectedResult = -1;
        int result = Main.findWordPosition(source, target);
        assertEquals(expectedResult, result);
    }

    //3
    @Test
    void testStringReverse() {
        String str = "Hello";
        char[] expectedResult = {'o','l','l','e','H'}; // у консоль виведеться:  olleH
        char[] result = Main.stringReverse(str);
        assertArrayEquals(expectedResult, result);
    }

    //4
    @Test
    void testIsPalindromeTrue() {
        String str = "ERE";
        boolean expectedResult = true;
        boolean result = Main.isPalindrome(str);
        assertEquals(expectedResult, result);
    }

    @Test
    void testIsPalindromeFalse() {
        String str = "Allo";
        boolean expectedResult = false;
        boolean result = Main.isPalindrome(str);
        assertEquals(expectedResult, result);
    }

}
