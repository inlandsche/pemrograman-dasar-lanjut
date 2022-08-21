import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int input = in.nextInt();

        String horoscope = "";

        if (input % 12 == 4){
            horoscope = "Rat";
        }else if (input % 12 == 5){
            horoscope = "Cow";
        }else if (input % 12 == 6){
            horoscope = "Tiger";
        }else if (input % 12 == 7){
            horoscope = "Rabbit";
        }else if (input % 12 == 8){
            horoscope = "Dragon";
        }else if (input % 12 == 9){
            horoscope = "Snake";
        }else if (input % 12 == 10){
            horoscope = "Horse";
        }else if (input % 12 == 11){
            horoscope = "Goat";
        }else if (input % 12 == 0){
            horoscope = "Monkey";
        }else if (input % 12 == 1){
            horoscope = "Rooster";
        }else if (input % 12 == 2){
            horoscope = "Dog";
        }else if (input % 12 == 3){
            horoscope = "Pig";
        }

        System.out.print("Your horoscope sign: " + horoscope);
    }
}
