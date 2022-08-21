public class Segitiga extends BangunDatar implements Hitung{
    private double alas;
    private double tinggi;

    public Segitiga(String nama, double alas, double tinggi) {
        this.setNama(nama);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void info() {
        System.out.printf("====================================================\n" +
                        "Nama Bangun Datar\t\t: %s\n" +
                        "Panjang Alas\t\t\t: %.2f\n" +
                        "Tinggi\t\t\t\t\t: %.2f\n" +
                        "Luas\t\t\t\t\t: %.2f\n" +
                        "Keliling\t\t\t\t: %.2f\n" +
                        "Nilai Spesial\t\t\t: %.2f\n",
                        this.nama, alas, tinggi, this.hitungLuas(),
                        this.hitungKeliling(), this.hitungSpesial());
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        double s = Math.sqrt((alas * alas) + (tinggi * tinggi));

        return s + alas + tinggi;
    }

    @Override
    public double hitungSpesial() {
        return Math.sqrt((alas * alas) + (tinggi * tinggi));
    }

}
