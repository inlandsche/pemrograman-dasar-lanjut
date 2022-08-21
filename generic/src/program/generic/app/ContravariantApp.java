package program.generic.app;

import program.generic.data.Nilai;

public class ContravariantApp {
    public static void main(String[] args) {
        Nilai<Object> objectNilai = new Nilai<>("Innova");
        objectNilai.setData(1000);

        // dapat menggunakan metode ini
        Nilai<? super String> stringNilai = objectNilai;
        System.out.println(stringNilai.getData());

        proses(stringNilai);
        System.out.println(stringNilai.getData());
    }

    public static void proses(Nilai<? super String> strNilai){
        Object value = strNilai.getData();

        System.out.println("hasil dari strnilai adalah: " + value);

        // pada contravariant dapat melakukan set nilai
        strNilai.setData("Toyota Innova");
    }
}
