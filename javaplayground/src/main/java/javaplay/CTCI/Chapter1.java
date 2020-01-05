package javaplay.CTCI;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
        
        if (str1.length() != str2.length()){
            return false;
        }
        
        Map<Character,Integer> str1map = new HashMap<>();
        Map<Character,Integer> str2map = new HashMap<>();

        for (Character element : str1.toCharArray()) {
            
            if (str1map.containsKey(element)){
                str1map.put(element, str1map.get(element) + 1);
            }else{
                str1map.put(element, Integer.valueOf(1));
            }

        }

        for (Character element : str2.toCharArray()) {
            
            if (str2map.containsKey(element)){
                str2map.put(element, str2map.get(element) + 1);
            }else{
                str2map.put(element, Integer.valueOf(1));
            }
            
        }

        
        return str1map.equals(str2map);
    }

    public static String URLify() {

        return "";
    }

}