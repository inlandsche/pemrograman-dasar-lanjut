public class Persegi extends BangunDatar implements Hitung {
    private double panjangSisi;

    public Persegi(String nama, double panjangSisi) {
        this.setNama(nama);
        this.panjangSisi = panjangSisi;
    }

    @Override
    public void info() {
        System.out.printf("====================================================\n" +
                        "Nama Bangun Datar\t\t: %s\n" +
                        "Panjang Sisi\t\t\t: %.2f\n" +
                          "Luas\t\t\t\t\t: %.2f\n" +
                          "Keliling\t\t\t\t: %.2f\n" +
                          "Nilai Spesial\t\t\t: %.2f\n",
                           this.nama, panjangSisi, this.hitungLuas(),
                           this.hitungKeliling(), this.hitungSpesial());
    }

    @Override
    public double hitungLuas() {
        return panjangSisi * panjangSisi;
    }

    @Override
    public double hitungKeliling() {
        return panjangSisi * 4;
    }

    @Override
    public double hitungSpesial() {
        return panjangSisi * Math.sqrt(2);
    }
}
