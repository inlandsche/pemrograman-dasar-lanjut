package com.tutorial;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b, c, d, e, jumlah, min, max;
        float rerata;

        System.out.print("Masukkan nilai: ");
        a = input.nextInt();
        System.out.print("Masukkan nilai: ");
        b = input.nextInt();
        System.out.print("Masukkan nilai: ");
        c = input.nextInt();
        System.out.print("Masukkan nilai: ");
        d = input.nextInt();
        System.out.print("Masukkan nilai: ");
        e = input.nextInt();

        jumlah = a + b + c + d + e;
        System.out.printf("Jumlah: %d \n", jumlah);

        rerata = (float)(jumlah / 5);
        System.out.printf("Rata-rata: %.2f \n", rerata);

        if (a<b && a<c && a<d && a<e){
            min = a;
            System.out.print("Nilai min: " + min + "\n");
        } else if (b<a && b<c && b<d && b<e){
            min = b;
            System.out.print("Nilai min: " + min + "\n");
        } else if (c<a && c<b && c<d && c<e){
            min = c;
            System.out.print("Nilai min: " + min + "\n");
        } else if (d<a && d<b && d<c && d<e){
            min = d;
            System.out.print("Nilai min: " + min + "\n");
        } else if (e<a && e<b && e<c && e<d){
            min = e;
            System.out.print("Nilai min: " + min + "\n");
        }
        if (a>b && a>c && a>d && a>e){
            max = a;
            System.out.print("Nilai max: " + max);
        } else if (b>a && b>c && b>d && b>e){
            max = b;
            System.out.print("Nilai max: " + max);
        } else if (c>a && c>b && c>d && c>e){
            max = c;
            System.out.print("Nilai max: " + max);
        } else if (d>a && d>b && d>c && d>e){
            max = d;
            System.out.print("Nilai max: " + max);
        } else if (e>a && e>b && e>d && e>c){
            max = e;
            System.out.print("Nilai max: " + max);
        }

        // Mencari nilai min dan max bisa juga menggunakan
        System.out.println();
        System.out.println("Nilai Min: " + Math.min(a,Math.min(b,Math.min (c, Math.min(d,e)))));
        System.out.println("Nilai Max: " + Math.max(a, Math.max(b, Math.max(c, Math.max(d,e)))));
    }
}
