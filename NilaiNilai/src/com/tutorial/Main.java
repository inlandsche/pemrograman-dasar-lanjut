package com.tutorial;

import java.io.PrintStream;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);

	float InputNilai;
	String hasil;

        System.out.print("Masukkan nilai saudara: ");
        InputNilai = inp.nextFloat();


            if (InputNilai>0 && InputNilai<100) {
                if (InputNilai > 80){
                System.out.printf("Nilai saudara: %.2f memperoleh grade A \n", InputNilai);
            }       else if (InputNilai > 75 && InputNilai <= 80){
                    System.out.printf("Nilai saudara: %.2f memperoleh grade B+ \n", InputNilai);
            }       else if (InputNilai > 69 && InputNilai <= 75){
                    System.out.printf("Nilai saudara: %.2f memperoleh grade B \n", InputNilai);
            }       else if (InputNilai > 60 && InputNilai <= 69) {
                    System.out.printf("Nilai saudara: %.2f memperoleh grade C+ \n", InputNilai);
            }       else if (InputNilai > 56 && InputNilai <= 60) {
                    System.out.printf("Nilai saudara: %.2f memperoleh grade C \n", InputNilai);
            }       else if (InputNilai > 50 && InputNilai <= 56) {
                    System.out.printf("Nilai saudara: %.2f memperoleh grade D+ \n", InputNilai);
            }       else if (InputNilai > 40 && InputNilai <= 50) {
                    System.out.printf("Nilai saudara: %.2f memperoleh grade D \n", InputNilai);
            }       else if (InputNilai <= 40) {
                    System.out.printf("Nilai saudara: %.2f memperoleh grade E \n", InputNilai);
            }
        } else {
            System.out.println("nilai tidak dapat diproses");
        }


    }
}
