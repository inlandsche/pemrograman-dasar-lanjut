package program.generic.app;

import program.generic.data.Nilai;

public class InvariantApp {
    public static void main(String[] args) {
        Nilai<String> stringNilai = new Nilai<>("Makmur");

        // tidak dapat melakukan casting seperti ini
        // Nilai<Object> objectNilai = stringNilai;

        // hal ini juga tidak bisa dilakukan
        // rekam(stringNilai);

        Nilai<Object> objectNilai = new Nilai<>(1000);
    }

    public static void rekam(Nilai<Object> objectNilai){

    }
}
