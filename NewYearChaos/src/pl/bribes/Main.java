package pl.bribes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] arr1 ={2, 1, 5, 3, 4};
        int[] arr2 ={2, 5, 1, 3, 4};
        minimumBribes(arr1);
        minimumBribes(arr2);

    }
    public static void minimumBribes(int[] arr) {
        /*int minB = 0;
        boolean isChaotic = false;

        for (int j = 0; j < arr.length; j++) {
            if(isChaotic==true)
                break;
            for (int i = 0; i < arr.length - 1; i++) {
                if(arr[i] > i+3){
                    System.out.println("Too chaotic");
                    isChaotic = true;
                    break;
                }
                if (arr[i] > arr[i + 1]) {
                    int a = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = a;
                    minB++;
                }
            }
        }
        if(isChaotic==false) {
            System.out.println(minB);
        }
        for(int x: helpfulArray){
            System.out.println(x);
        }
        for (int i = 0; i < arr.length-1; i++){
            if(arr[i]< i+1){
                if (arr[i] > arr[i+1]){
                    minB++;
                }
                continue;
            }
            if (arr[i] == i+2){
                minB++;
            }
            if (arr[i] == i+3){
                minB+=2;
            }

            if (arr[i] > i+3){
                System.out.println("Too Chaotic");
                minB = 0;
                break;
            }
        }
        if (!(minB==0)) {
            System.out.println(minB);
        }*/
        int ans = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, arr[i] - 2); j < i; j++)
                if (arr[j] > arr[i]) ans++;
        }
        System.out.println(ans);
    }

}



