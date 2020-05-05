package pl.anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(sherlockAndAnagrams("kkkk"));
    }

    static int sherlockAndAnagrams(String s) {
        int result = 0;
        List<String>list = new ArrayList<String>();
        for(int i = 0; i < s.length()+1; i++){
            for (int j = i+1; j < s.length()+1; j++){
                char[] ss = s.substring(i,j).toCharArray();
                Arrays.sort(ss);
                String sss = String.valueOf(ss);
                if(list.contains(sss)){
                    result += 1;
                }else
                    list.add(sss);

            }
        }
        return result;
    }

    /*static int helpful(String s1, String s2) {
        int pomoc = 0;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        for(int i = 0; i < c1.length; i++) {
            for(int j = 0; j < c2.length; j++){
                if(c1[i] == c2[j]){
                    c1[i] = '!';
                    c2[j] = '@';
                    pomoc++;
                }
            }

        }
        if(pomoc == c1.length){
            return 1;
        }
        else
            return 0;
    }*/
    static int ex2(String s) {
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            String substring = s.substring(i+1,s.length()-1);
            char base = s.charAt(i);
            int index = substring.indexOf(base);
        }
        return result;
    }
    static int sherlockAndAnagrams2(String s) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        // Keep track of how many anagrams we've seen
        int totalCount = 0;

        // Generate all substrings (N^2)
        for(int i = 0 ; i < s.length(); i++)
        {
            for(int j=i+1 ; j <= s.length(); j++)
            {
                String currentSubString = s.substring(i,j);

                // Sort all strings E.g. ab & ba both == ab now
                char[] chars = currentSubString.toCharArray();
                Arrays.sort(chars);
                currentSubString = String.valueOf(chars);

                // If sorted substring has been seen before
                if(map.containsKey(currentSubString))
                {
                    // Check how many times we've seen it and add that amount to the count
                    int value = map.get(currentSubString);
                    totalCount=totalCount+value;

                    // Increment the times we've seen the string
                    map.put(currentSubString, value+1);
                }
                else
                {
                    // Never seen it before = insert and set to 1 to indiciate we've now seen it
                    map.put(currentSubString, 1);
                }
            }
        }
        return totalCount;
    }
}
