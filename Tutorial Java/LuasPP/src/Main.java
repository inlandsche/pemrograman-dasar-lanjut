/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Qolandar
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("===LUAS PERSEGI PANJANG===");
        
        float panjang,lebar,luas;
        
        System.out.print("Panjang : ");
        panjang = input.nextFloat();
        System.out.print("Lebar : ");
        lebar = input.nextFloat();
        
        luas = panjang * lebar;
        System.out.print("Luas : ");
        System.out.println(luas);
        
        // 2 angka di belakang koma (printf)
        // %.2f
        
    }
    
}
