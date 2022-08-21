package Praktikum5;

import java.util.ArrayList;

public class tobiner {
    public static void main(String[] args) {

        int decimal = 2;

        System.out.println(Integer.toBinaryString(decimal));
        toBinary(decimal);
        toBinaryWithList(decimal);


    }

    static void toBinary(int decimal){
        int binary[] = new int[100];

        int i = 0;

        while (decimal > 0){
            binary[i] = decimal % 2;
            decimal /= 2;
            i++;
        }

        for (int j = i -1; j >= 0; j--){
            System.out.print(binary[j]);
        }

        System.out.println();
    }

    static void toBinaryWithList(int decimal){
        ArrayList<Integer> binary = new ArrayList<>();

        int i = 0;

        while (decimal > 0){
            binary.add(decimal%2);
            decimal = decimal / 2;
            i++;
        }

        for (int j = i - 1; j >= 0; j--){
            System.out.print(binary.get(j));
        }
    }
}
