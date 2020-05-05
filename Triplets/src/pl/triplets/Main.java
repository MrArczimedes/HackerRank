package pl.triplets;

import java.io.BufferedReader;
import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Long ratio = 3L;
        List<Long> arr = Arrays.asList(1l, 3l, 9l, 9l, 27l, 81l);
        System.out.println(triplets2(ratio,arr));
    }
    static long tripes(long r, List<Long> arr) {
        Collections.sort(arr);
        long cases = 0l;

        for(int i = 0; i < arr.size(); i++) {
            long helpfulcases = 0l;
            long helpfulcases2 = 0l;
            long helpfulcases3 = 0l;
            long base = arr.get(0);
            if(arr.contains(base*r) && arr.contains(base*r*r)) {
                int thirdIndex = arr.indexOf(base * r * r);
                int secondIndex = arr.indexOf(base * r);
                int firstIndex = arr.indexOf(base);
                helpfulcases = iterator(arr, thirdIndex, arr.size(), base * r * r);
                helpfulcases2 = iterator(arr, secondIndex, thirdIndex, base * r);
                helpfulcases3 = iterator(arr, firstIndex, secondIndex, base);
                cases += helpfulcases * helpfulcases2 * helpfulcases3;
                arr = arr.subList((int) (firstIndex + helpfulcases3), arr.size());
                System.out.println(arr);
            }
        }
        return cases;
    }

    static long iterator(List<Long> arr, int indexStart, int indexEnd,long base){
        int helpfulcases = 0;
        List<Long> arr2 = arr.subList(indexStart, indexEnd);
        while(true) {
            if(arr2.contains(base)){
                helpfulcases++;
            }
            else
                break;
            arr2 = arr2.subList(1,arr2.size());
        }
        return helpfulcases;
    }
    static long dict(List<Long> arr, long r){
        long result = 0;
        return result;
    }
    static long triplets2(Long r, List<Long> arr){
        long result = 0;
        Map<Long,Long> map = new HashMap();
        Map<Long,Long> map2 = new HashMap();
        Long a = 0L;
        for(int i = arr.size()-1; i>=0; i--){

            if(map.containsKey(a*r)){
                Long value = map.get(arr.get(i));
                map2.put(a,value+1L);
            }
            a = arr.get(i);
            if(map2.containsKey(a*r)) {
                result += map2.get(a*r);
            }
            map.put(a, map.getOrDefault(a, 0L) + 1);
        }
        return result;
    }
}


