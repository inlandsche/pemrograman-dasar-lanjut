package com.tutorial;

import java.util.*;
public class Main {

    public static void main(String[] args) {
	// PROGRAM OPERASI LOGIKA SEDERHANA

        Scanner in = new Scanner(System.in);

        System.out.println("==== NEBAK YUK! ====");
        int Nilai = 9;
        System.out.print("Masukkan nilai tebakan: ");
        int Tebakan = in.nextInt();

        boolean Hasil = (Nilai == Tebakan);
        System.out.printf("Hasil tebakan anda: %b \n", Hasil);

        System.out.println("==== NEBAK YUK Part II ====");
        System.out.println("Tebak yuk angka 1 sampai 10");

        System.out.print("Masukkan tebakan: ");
        int Tebakan2 = in.nextInt();

        boolean Hasil2 = (Tebakan2 == 5);
        System.out.print("Apakah benar??? " + Hasil2);

    }
}
