package pl.shift.left;

public class Main {

    public static void main(String[] args) {


            int[] a = {1,2,3,4,5};
            int d = 4;
            int[] helpfulArray = a.clone();
            int range = d;
            for (int i = 0; i < a.length; i++) {
                int x = i - range;
                if (x < 0) {
                    helpfulArray[helpfulArray.length + x] = a[i];
                } else {
                    helpfulArray[i - d] = a[i];
                }

            }
            for (int x : helpfulArray) {
                System.out.print(x);
            }


     }
}
