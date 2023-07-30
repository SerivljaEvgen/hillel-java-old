package homework.task_5_characters;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1
        int findSymbolOccurance = findSymbolOccurance("Java", 'a');
        System.out.println("Number of occurrences: " + findSymbolOccurance);

        //2 
        int findWordPosition = findWordPosition("Apple", "Plant");
        System.out.println("Position index: " + findWordPosition);

        //3
        System.out.print("Reversed output: ");
        System.out.println(stringReverse("Hello"));

        //4
        System.out.println("Is Palindrome ? - " + isPalindrome("ERES"));

    }

    public static boolean isPalindrome(String str) {
        char[] charArray = str.toCharArray();
        char[] charArrayReversed = stringReverse(str);
        return Arrays.equals(charArray, charArrayReversed);
    }

    public static char[] stringReverse(String str) {
        char[] charArray = str.toCharArray();
        for (int l = 0, r = charArray.length - 1; l < r; l++, r--) {
            char temp = charArray[l];
            charArray[l] = charArray[r];
            charArray[r] = temp;
        }
        return charArray;
    }

    public static int findWordPosition(String source, String target) {
        int index = source.indexOf(target);
        return index;
    }

    public static int findSymbolOccurance(String str, char ch) {
        int count = 0;
        char[] charArray = str.toCharArray();
        for (char each : charArray) {
            if (each == ch) {
                count++;
            }
        }
        return count;
    }
}
