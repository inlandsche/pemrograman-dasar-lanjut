package praktikum6;

public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    @Override
    public double gaji() {
        return this.getPenjualan() * this.getKomisi();
    }

    @Override
    public String toString() {
        return String.format("++++++++++++++++++++++++++++" +
                             "\n\t\t\tSales" +
                             "\n++++++++++++++++++++++++++++\n" +
                             "Nama\t\t\t: %s\n" +
                             "No. KTP\t\t\t: %s\n" +
                             "Total penjualan\t: %d\n" +
                             "Besaran komisi\t: %.0f\n" +
                             "Pendapatan\t\t: Rp%.0f\n",
                             this.getNama(), this.getNoKTP(),
                             this.getPenjualan(), this.getKomisi(),
                             this.gaji());
    }

    public static void main(String[] args) {

        //pembuatan objek
        Pegawai fajri = new Sales("Fajri Rahmanu", "3302141807960006", 20, 10000);
        Pegawai fariz = new Sales("Alfarizi", "3302162807920010", 10, 15000);
        Pegawai kira = new Sales("Kirana", "3302170807990009", 30, 20000);

        //cetak objek
        System.out.println(fajri);
        System.out.println(fariz);
        System.out.println(kira);
    }
}
