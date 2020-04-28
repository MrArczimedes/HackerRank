package pl.arrays;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int[][] array = {
                {1,4,8},
                {2,6,10},
                {3,10,1},
                {1,6,3}
        };
    }
    // dobry, ale za wolny
    public static long manipulatingArray(int zeroArrays, int[][] queries){
        long highest = 0;
        int[] zeros= new int[zeroArrays];
        for (int i = 0; i<queries.length; i++){
            int indexA = queries[i][0];
            int indexB = queries[i][1];
            int operations = queries[i][2];
            for(int j = indexA; j<=indexB; j++){
                zeros[j] += operations;
                if(zeros[j] > highest){
                    highest=zeros[j];
                }}
        }
        return highest;
    }
    public static long manipulatingArray2(int n, int[][] queries){
        long[] output = new long [n+2];
        for (int i = 0; i < queries.length; i++){
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];
            output[a] += k;
            output[b+1] -= k;
        }
        long max = getMax(output);
        return max;
    }
    private static long getMax(long[] output){
        long max = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i<output.length; i++){
            sum += output[i];
            max = Math.max(max,sum);
        }
        return max;
    }

}

