package javaplay.CTCI;

import java.util.HashSet;
import java.util.Set;

public class Chapter1 {

    public static Boolean isUnique(String str) {
        // implement

        Set<Character> unique = new HashSet<>();
        for (char character : str.toCharArray()) {
            Character ch = Character.valueOf(character);
            if (unique.contains(ch)) {
                return false;
            }else{
                unique.add(ch);
            }

        }
        //System.out.println("");

        return true;
    }

    public static Boolean checkPermutation(String str1, String str2) {

        return true;
    }

    public static String URLify() {

        return "";
    }

}