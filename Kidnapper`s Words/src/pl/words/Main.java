package pl.words;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] magazine = {"ive", "got", "a", "lovely", "bunch", "of", "coconuts"};
        String[] note = {"ive", "got", "some", "coconuts"};

        boolean isMatch = false;
        for (int i = 0; i < note.length; i++) {
            for (int j = 0; j < magazine.length; j++) {
                if (note[i].equals(magazine[j])) {
                    isMatch = true;
                    magazine[j] = "";
                    break;
                } else {
                    isMatch = false;
                }
            }
            if (isMatch == false) break;
        }
        if (isMatch == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


