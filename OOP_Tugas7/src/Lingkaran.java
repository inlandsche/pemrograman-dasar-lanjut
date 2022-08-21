public class Lingkaran extends BangunDatar implements Hitung {
    private double jari;
    private final double pi = 3.14;

    public Lingkaran(String nama, double jari) {
        this.setNama(nama);
        this.jari = jari;
    }

    @Override
    public void info() {
        System.out.printf("====================================================\n" +
                        "Nama Bangun Datar\t\t: %s\n" +
                        "Panjang Jari-jari\t\t: %.2f\n" +
                        "Luas\t\t\t\t\t: %.2f\n" +
                        "Keliling\t\t\t\t: %.2f\n" +
                        "Nilai Spesial\t\t\t: %.2f\n",
                        this.nama, jari, this.hitungLuas(),
                        this.hitungKeliling(), this.hitungSpesial());
    }

    @Override
    public double hitungLuas() {
        return pi * jari * jari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * pi * jari;
    }

    @Override
    public double hitungSpesial() {
        double luasJuring = (0.25 * this.hitungLuas());
        double luasSegitiga = 0.5 * jari * jari;

        return luasJuring - luasSegitiga;
    }
}
