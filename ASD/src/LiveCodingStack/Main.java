package LiveCodingStack;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String[] arr = input.split(",");
        ArrayList<String> operand = new ArrayList<>();

        double var1, var2, hasil = 0;


        for (int i = 0; i < arr.length; i++){
            if (!arr[i].equals("+") && !arr[i].equals("-") && !arr[i].equals("*")
                    && !arr[i].equals("/") && !arr[i].equals("^"))
                s.push(Integer.parseInt(arr[i]));
        }

        int i = 0;
        while (s.getSize() != 1){
            switch (arr[i]) {
                case "+":
                    var1 = s.pop();
                    var2 = s.pop();

                    hasil = var2 + var1;
                    s.push((int) hasil);
                    break;
                case "-":
                    var1 = s.pop();
                    var2 = s.pop();

                    hasil = var2 - var1;
                    s.push((int) hasil);
                    break;
                case "*":
                    var1 = s.pop();
                    var2 = s.pop();

                    hasil = var2 * var1;
                    s.push((int) hasil);
                    break;
                case "/":
                    var1 = s.pop();
                    var2 = s.pop();

                    hasil = var2 / var1;
                    s.push((int) hasil);
                    break;
                case "^":
                    var1 = s.pop();
                    var2 = s.pop();

                    hasil = Math.pow(var2, var1);
                    s.push((int) hasil);
                    break;
            }

            i++;
        }



        System.out.println(Math.round(hasil));
    }

}
