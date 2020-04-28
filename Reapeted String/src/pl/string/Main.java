package pl.string;


import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String s = myScanner.nextLine();
        long n = myScanner.nextLong();
        long counter = 0;
        //Wolny sposob
        /*List<Character> list;
        list = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        int listsize = list.size();
        for (int i = listsize; i< n; i++){
            if(list.size()<=n){
                char c =list.get(i%listsize);
                list.add(c);
            }
        }
        for(char a : list){
            if(a == 'a')
                counter++;
        }
        \\Sposob za maly
        char[] c = s.toCharArray();
        char[] c2 = new char[(int) n];
        for (int i = 0; i<n; i++){
            c2[i] = c[i%c.length];
        }
        for (char x : c2){
            if(x=='a')
                counter++;
        }
        System.out.println(counter);*/
        //Sprytny sposob
        char[] c = s.toCharArray();
        for(char c2 : c){
            if(c2=='a')
                counter++;
        }
        long times = n/c.length;
        long length = (long) c.length;
        long remainder = n%length;
        counter = counter *times;
        for (int i = 0; i<remainder;i++ )
            if(c[i]=='a')
                counter++;
    }
    }

