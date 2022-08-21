package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String inputJam = in.nextLine();
        inputJam = inputJam.replace(':', '.');
        double Jam = Double.parseDouble(inputJam);

        String output;

        if (Jam<24.00){
            if (Jam>04.00 && Jam<11.00){
                output = "Pagi";
                System.out.println(output);
            }
            else if (Jam>11.00 && Jam<15.00){
                output = "Siang";
                System.out.println(output);
            }
            else if (Jam>15.00 && Jam<18.30){
                output = "Sore";
                System.out.println(output);
            }
            else if (Jam>18.31 && Jam<04.00){
                output = "Malam";
                System.out.println(output);
            }
        }

    }
        }


