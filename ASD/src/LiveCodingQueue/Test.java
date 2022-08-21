package LiveCodingQueue;

import java.util.Scanner;

public class Test {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Queue an = new Queue();

        int m = in.nextInt();
        in.nextLine();

        String input = in.nextLine();
        String []arr = input.split(",");

        for (int i = 0; i < m; i++){
            an.enqueue(new QueueNode(Integer.parseInt(arr[i]), " "));
        }

        int n = in.nextInt();
        QueueNode qn = new QueueNode(n,"Sia");
        an.enqueue(qn);

        int a = 0;

        while (true){
            QueueNode hlp = an.dequeue();

            if (hlp.id.equals("Sia")){
                if (hlp.data > 2){
                    hlp.data = hlp.data - 2;
                    an.enqueue(hlp);
                } else {
                    break;
                }
            } else {
                if (hlp.data > 2){
                    int temp = hlp.data;
                    hlp.data = hlp.data - 2;
                    an.enqueue(hlp);
                }
                a++;
            }
        }

        System.out.println(a);
    }
}
