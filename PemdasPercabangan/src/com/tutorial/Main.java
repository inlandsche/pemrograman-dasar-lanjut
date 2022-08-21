package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int angka1, angka2, op, hasil, jawab;

	    // MAth.random()*9 = mengeluarkan angka random dari 0 sampai <9 dalam bentuk double
        // ditambah 1 artinya mulai dari bilangan random 0 itu ditambah 1, sehingga hasilnya 1 sampai 9
	    angka1 = (int) (Math.random()*9)+1;
        angka2 = (int) (Math.random()*9)+1;
        op = (int) (Math.random()*5);


        // Jika menggunakan if else
        /* if (op==0){
            System.out.print(angka1 + " + " + angka2 + " = ");
            hasil = angka1+angka2;
        } else if (op==1){
            System.out.print(angka1 + " - " + angka2 + " = ");
            hasil = angka1-angka2;
        } else if (op==2){
            System.out.print(angka1 + " x " + angka2 + " = ");
            hasil = angka1*angka2;
        } else {
            System.out.print(angka1 + " / " + angka2 + " = ");
            hasil = angka1/angka2;
        } */

        // Jika menggunakan Switch case
        // break artinya berhenti, jika tanpa break maka akan terus dieksekusi

        switch (op){
            case 0 : System.out.print(angka1 + " + " + angka2 + " = ");
                hasil = angka1+angka2;
                break;
            case 1 : System.out.print(angka1 + " - " + angka2 + " = ");
                hasil = angka1-angka2;
                break;
            case 2 : System.out.print(angka1 + " x " + angka2 + " = ");
                hasil = angka1*angka2;
                break;
            case 3 : System.out.print(angka1 + " ^ " + angka2 + " = ");
            // Perpangkatan menggunakan Math.pow(a,b) kalau integer harus dicasting dulu
                hasil = (int) Math.pow(angka1,angka2);
                break;
            default: System.out.print(angka1 + " / " + angka2 + " = ");
                hasil = angka1/angka2;

        }

            Scanner input = new Scanner(System.in);
            jawab = input.nextInt();

        if (jawab==hasil){
            System.out.println("Bener Gan");
        } else {
            System.out.printf("Salah Lur, harusnya %d \n", hasil);
        }
    }
}
