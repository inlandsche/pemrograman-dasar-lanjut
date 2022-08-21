package program.generic.app;

import program.generic.data.Nilai;

public class AppNilai {
    public static void main(String[] args) {
        Nilai<String> pertama = new Nilai<>("rudi");
        Nilai<Integer> kedua = new Nilai<>(20);

        String value1 = pertama.getData();
        Integer value2 = kedua.getData();

        System.out.println(value1);
        System.out.println(value2);
    }
}
