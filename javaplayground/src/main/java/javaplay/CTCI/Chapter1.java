package javaplay.CTCI;

import java.util.HashSet;
import java.util.Set;

public class Chapter1 {

    public static Boolean isUnique(String str) {
        // implement
        Boolean result = true;
        Set<Character> unique = new HashSet<>();
        for (char character : str.toCharArray()) {
            Character ch = Character.valueOf(character);
            result = unique.contains(ch) ? false : unique.add(ch);

        }
        return result;
    }

    public static Boolean checkPermutation(String str1, String str2) {

        return true;
    }

    public static String URLify() {

        return "";
    }

}