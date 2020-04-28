package pl.valleys;

import java.util.Scanner;

public class CalculatingTerrain {
    public static int countingValleys(int n, String s) {
        int currentCounter =0;
        int beforeCounter = 0;
        int valleysCounter = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'D')
                currentCounter--;
            if(s.charAt(i) == 'U')
                currentCounter++;
            if(currentCounter == 0 && beforeCounter == -1)
                valleysCounter++;
            beforeCounter = currentCounter;
        }
        return valleysCounter;
    }
}
