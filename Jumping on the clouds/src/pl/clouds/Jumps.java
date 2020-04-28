package pl.clouds;

public class Jumps {
    public static int jumpingOnClouds(int[] c) {
        int count = -1;
        int n = c.length;
        for (int i = 0; i < n; i++, count++) {
            if (i<n-2 && c[i+2]==0) i++;
        }
        return count;
    }
}
