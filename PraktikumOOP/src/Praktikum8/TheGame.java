package Praktikum8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TheGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Character character = new Warrior();
        Character titan = new Titan();

        System.out.println("Selamat datang di game Defend Filkom !");
        System.out.print("Silahkan masukkan nama player : ");
        String inputNama = in.nextLine();

        boolean salah = true;

        while (salah) {
            try {
                System.out.println("Silahkan pilih karakter yang anda inginkan\t:");
                System.out.println("1. Magician");
                System.out.println("2. Healer");
                System.out.println("3. Warrior");
                System.out.println("Pilihan\t: ");
                int pilihan;

                pilihan = in.nextInt();

                switch (pilihan) {
                    case 1:
                        character = new Magician();
                        salah = false;
                        break;
                    case 2:
                        character = new Healer();
                        salah = false;
                        break;
                    case 3:
                        character = new Warrior();
                        salah = false;
                        break;
                    default:
                        System.out.println("Silahkan masukkan angka 1 - 3 !");
                }
            } catch (InputMismatchException e) {
                System.out.println("Silahkan masukkan angka 1 - 3 !");
                in.next();
            }
        }

        character.info();

        int turn = 0;
        while (character.getHP() != 0 && titan.getHP() != 0){
            ++turn;

            System.out.printf("++++++++++++ TURN %d ++++++++++++\n", turn);

            if (character instanceof Healer){
                if (turn % 2 == 0){
                    ((Healer) character).heal();
                }
            }

            if (character.attack()){
                titan.receiveDamage(character.getAttack());
                System.out.println(inputNama + " hit Titan !");
            }
            if (titan.attack()){
                character.receiveDamage(titan.getAttack());
                System.out.println("Titan hit " + inputNama +" !");
            }


            System.out.printf("Enemy's HP\t: %d\n", titan.getHP());
            System.out.printf("%s's HP\t: %d\n", inputNama, character.getHP());
        }

        System.out.println("\n++++++++++++++++++++++++++++++++");
        if (titan.getHP() == 0) System.out.println(inputNama + " menang");
        else if (character.getHP() == 0) System.out.println("Titan menang");
        System.out.println("++++++++++++++++++++++++++++++++");

        System.out.println();
        System.out.println("************ PLAYER ************");
        character.info();
        System.out.println("********************************\n");

        System.out.println("************  MUSUH *************");
        titan.info();
        System.out.println("********************************");


    }

}
