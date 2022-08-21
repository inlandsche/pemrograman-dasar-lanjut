package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int jmlHari, bulan, tahun;

        System.out.print("Bulan: ");
        bulan = in.nextInt();
        System.out.print("Tahun: ");
        tahun = in.nextInt();

        if (bulan>=1 && bulan<=12){
            if (bulan==1 || bulan==3 || bulan==5 || bulan==7 || bulan==8 || bulan==10 || bulan==12){
                jmlHari = 31;
                System.out.println("Jumlah hari: " + jmlHari);
            }
            else if (bulan==4 || bulan==6 || bulan==9 || bulan==11){
                jmlHari = 30;
                System.out.println("Jumlah hari: " + jmlHari);
            }
            else {
                if (tahun%4==0){
                    jmlHari = 29;
                    System.out.println("Jumlah hari: " + jmlHari);
                }
                else {
                    jmlHari = 28;
                    System.out.println("Jumlah hari: " + jmlHari);
                }
            }

        } else {
            System.out.println("Bukan merupakan bulan");
        }





    }
}
