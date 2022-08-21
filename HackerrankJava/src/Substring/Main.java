package Substring;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String c[] = sub("anjas", 2);

        System.out.println(Arrays.toString(c));
    }


public static String[] sub(String word, int n){
    String arr[] = new String[word.length()];
    int index = 0;

    for (int i = 0; i <= word.length() - n; i++) {
        arr[index] = word.substring(i, n+i);
        index++;
    }

    ArrayList<Integer> a = new ArrayList<>();
    

    return arr;
}

}

