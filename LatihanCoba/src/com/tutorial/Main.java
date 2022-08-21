package com.tutorial;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        int banyaknya = in.nextInt();

        for (int i = 0; i < banyaknya; i++) {
            System.out.println(arr[in.nextInt()]);
            try {
            } catch (Exception e){
                System.out.println("Error");
            }
        }
    }
}
