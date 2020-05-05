package pl.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "hi";
    }

    static String twoStrings(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    return "YES";
                }
            }
        }
        return "NO";
    }

    static String twoStrings2(String s1, String s2) {
        for (char c : "qwertyuiopasdfghjklzxcvbnm".toCharArray()) {
            if (s1.indexOf(c) > -1 && s2.indexOf(c) > -1) {
                return "YES";
            }
        }
        return "NO";
    }
}
