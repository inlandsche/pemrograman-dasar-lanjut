package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int uang, cb, jumlahcb;

        uang = in.nextInt();
        cb = in.nextInt();
        jumlahcb = (cb * uang)/100;

        if (uang < 10000000) {
            if (cb > 20) {
                if (jumlahcb >= 50000) {
                    System.out.println("Bisa");
                } else {
                    System.out.println("Tidak Bisa");
                }
            }
        } else {
            System.out.println("Tidak dapat diproses");
        }
    }
}

