public class Trapesium extends BangunDatar implements Hitung{
    private double alasAtas;
    private double alasBawah;
    private double tinggi;

    public Trapesium(String nama, double alasAtas, double alasBawah, double tinggi) {
        this.setNama(nama);
        this.alasAtas = alasAtas;
        this.alasBawah = alasBawah;
        this.tinggi = tinggi;
    }

    @Override
    public void info() {
        System.out.printf("====================================================\n" +
                        "Nama Bangun Datar\t\t: %s\n" +
                        "Panjang Alas Atas\t\t: %.2f\n" +
                        "Panjang Alas Bawah\t\t: %.2f\n" +
                        "Tinggi Trapesium\t\t: %.2f\n" +
                        "Luas\t\t\t\t\t: %.2f\n" +
                        "Keliling\t\t\t\t: %.2f\n" +
                        "Nilai Spesial\t\t\t: %.2f\n",
                        this.nama, alasAtas, alasBawah, tinggi, this.hitungLuas(),
                        this.hitungKeliling(), this.hitungSpesial());
    }

    @Override
    public double hitungLuas() {
        return 0.5 * (alasAtas + alasBawah) * tinggi;
    }

    @Override
    public double hitungKeliling() {
        double alasSegitiga = (alasBawah - alasAtas) * 0.5;
        double s = Math.sqrt((alasSegitiga * alasSegitiga) + (tinggi * tinggi));

        return alasAtas + alasBawah + s + s;
    }

    @Override
    public double hitungSpesial() {
        if (alasAtas < alasBawah)
            return alasAtas * tinggi;
        else if (alasBawah < alasAtas)
            return alasBawah * tinggi;

        return 0;
    }
}
