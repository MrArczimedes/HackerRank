package pl.arrays.hourglasses;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] arr = new int[6][6];

        /*for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

         */

        arr = new int[][]{{-9, -9, -9, 1, 1, 1},
        {0, -9, 0, 4, 3, 2},
        {-9, -9, -9, 1, 2, 3},
        {0, 0, 8, 6, 6, 0},
        {0, 0, 0, -2, 0, 0},
        {0, 0, 1, 2, 4, 0}};
        for(int[] aarr: arr){
            System.out.println();
            for(int arrr: aarr){
                System.out.print(arrr + " ");
            }
        }
        int result = sumHourGlass(arr);
        System.out.println(result);
    }
    public static int sumHourGlass(int[][] arr){
        int counter = 0;
        int[] sum = new int[16];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    sum[counter] = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                            + arr[i + 1][j + 1] + arr[i + 2][j]
                            + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                    counter ++;
                }
            }
        int theBiggestNumber= sum[0];
        for (int x : sum){
            if(x>theBiggestNumber){
                theBiggestNumber = x;
            }
        }
        return theBiggestNumber;
    }
}
