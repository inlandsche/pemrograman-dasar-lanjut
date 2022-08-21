package praktikum6;

public class Main {
    public static void main(String[] args) {
        Pegawai abdul = new PegawaiHarian("Abdul","123", 10000, 50);
        System.out.println(abdul);

        PegawaiTetap abi = new PegawaiTetap("Abi Busni", "1211", 4000000);
        System.out.println(abi);

        PegawaiTetap janu = new PegawaiTetap("Januar", "1123", 3500000);
        System.out.println(janu);

        abdul = new PegawaiTetap("Abdul", "1234", 1000000);
        System.out.println(abdul);

        abdul = new Sales("Abdul", "1234", 100, 1500);
        System.out.println(abdul);
    }
}
