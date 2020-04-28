package pl.swaps;


import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 6, 7};
        swapping2(arr);

    }
    //Dobre, ale za dlugo sie wykonuje
    public static int swapping(int[] arr){
        List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toList());
        int swaps = 0;
        for(int i = 0; i< arr.length; i++){
            if(!(list.get(i).intValue() == i+1)){
                Collections.swap(list,i,list.indexOf(i+1));
                swaps++;
            }
        }
        return swaps;
    }
    public static int swapping2(int[] arr){
        int swaps = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            if(!(arr[i]==i+1)){
                for(int j = 0; j< arr.length; j++){
                    if(arr[j] == i+1){
                        int a = arr[i];
                        arr[i] = arr[j];
                        arr[j] = a;
                        swaps++;
                        break;
                    }
                }
            }
            else continue;

        }
        return swaps;
    }
}
