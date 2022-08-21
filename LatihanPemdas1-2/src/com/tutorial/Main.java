package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("==== MENENTUKAN KUADRAN DARI TITIK T ====");

        int x, y;
        String posisiT;

        System.out.println();
        System.out.print("Masukkan nilai dari sumbu x: ");
        x = in.nextInt();
        System.out.print("Masukkan nilai dari sumbu y: ");
        y = in.nextInt();

        if (x>0){
            if (y>0){
                posisiT = "Kuadran I";
                System.out.println("Letak titik T ada pada " + posisiT);
            }
            else if (y<0){
                posisiT = "Kuadran IV";
                System.out.println("Letak titik T ada pada " + posisiT);
            }
        } else {
            if (y>0){
                posisiT = "Kuadran II";
                System.out.println("Letak titik T ada pada " + posisiT);
            }
            else if (y<0){
                posisiT = "Kuadran III";
                System.out.println("Letak titik T ada pada " + posisiT);
            }
        

    }
}
