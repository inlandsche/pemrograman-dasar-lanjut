package Praktikum9;

public class Furniture{
    private String kodeBarang;
    private String namaBarang;
    private double beratBarang;
    private String jenisBarang;
    private double hargaBarang;

    public Furniture(String kodeBarang, String namaBarang, double beratBarang, String jenisBarang, double hargaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.beratBarang = beratBarang;
        this.jenisBarang = jenisBarang;
        this.hargaBarang = hargaBarang;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public double getBeratBarang() {
        return beratBarang;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public double getHargaBarang() {
        return hargaBarang;
    }

    @Override
    public String toString() {
        return String.format("Nama Barang\t\t: %s\n" +
                             "Kode\t\t\t: %s\n" +
                             "Jenis Barang\t: %s\n" +
                             "Harga\t\t\t: Rp%.0f\n",
                              getNamaBarang(),
                              getKodeBarang(),
                              getJenisBarang(),
                              getHargaBarang());

    }
}
