package pl.socks;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Socks {
    public static int sockMerchant(int n, int[] ar) {
        Set<Integer> treeSet = new TreeSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();

        for(int element: ar){
            treeSet.add(element);
        }
        int[] pairsTable = new int[treeSet.size()];
        for(int element : treeSet){
            list.add(element);
        }

        for(int element:ar) {
            pairsTable[list.indexOf(element)] +=1;
        }
        int pairs = 0;
        for(int element : pairsTable){
            pairs = pairs + (element/2);
        }

        return pairs;
    }
}
