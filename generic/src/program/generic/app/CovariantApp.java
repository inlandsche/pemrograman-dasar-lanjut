package program.generic.app;

import program.generic.data.Nilai;

public class CovariantApp {
    public static void main(String[] args) {
        Nilai<String> stringNilai = new Nilai<>("vape");

        // bisa dilakukan karena pada method proses, type telah diextends dari object
        proses(stringNilai);
    }

    public static void proses(Nilai<? extends Object> merkDagang){
        // tidak dapat melakukan set pada method ini
        // merkDagang.setData(1000);

        System.out.println(merkDagang.getData());
    }
}
