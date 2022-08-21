package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String lahir;
        double harga;
        int h, b, t, umurSkrg;

        lahir = inp.nextLine();
        harga = inp.nextDouble();

        h = Integer.parseInt(lahir.substring(0,3));
        b = Integer.parseInt(lahir.substring(3,5));
        t = Integer.parseInt(lahir.substring(5));

        umurSkrg = 2020 - t;
            if (b < 11 || (b == 11 && h <17) ) umurSkrg--;

            if (umurSkrg>50) harga = harga - (25/100.0)*harga;
            else if (umurSkrg>30) harga = harga - (20/100.0)*harga;
            else if (umurSkrg>20) harga = harga - (15/100.0)*harga;
            else if (umurSkrg>10) harga = harga - (10/100.0)*harga;

        System.out.println((int)harga);


    }
}
