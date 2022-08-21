public class Main {

    static  int counter = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++){
            buat();

        }


    }

    static void buat(){
        System.out.printf("\n Thread %d started, please wait...\n", counter);

        counter++;

        for(long i = 0; i < (0xFFFFFFFF); i++)

        System.out.printf("\n Thread %d finished\n", counter);

        System.out.println(counter);

    }
}
