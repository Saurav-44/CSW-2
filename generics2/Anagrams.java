package Generics;

import java.util.HashMap;

public class Anagrams {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        // Count characters in str1
        for (char ch : str1.toCharArray()) {
            hm1.put(ch, hm1.getOrDefault(ch, 0) + 1);
        }

        // Count characters in str2
        for (char ch : str2.toCharArray()) {
            hm2.put(ch, hm2.getOrDefault(ch, 0) + 1);
        }

        // Compare character frequencies
        return hm1.equals(hm2);
    }

    public static void main(String[] args) {
        String str1 = "cape";
        String str2 = "pace";
        
        boolean res = areAnagrams(str1, str2);

        if (res) {
            System.out.println(res);
        } else {
            System.out.println(!res);
        }
    }
}
