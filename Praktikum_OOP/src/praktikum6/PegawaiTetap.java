package praktikum6;

public class PegawaiTetap extends Pegawai{
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    @Override
    public double gaji() {
        return this.upah;
    }

    @Override
    public String toString() {
        return String.format("++++++++++++++++++++++++++++" +
                             "\n\t   Pegawai Tetap" +
                             "\n++++++++++++++++++++++++++++\n" +
                             "Nama\t\t\t: %s\n" +
                             "No. KTP\t\t\t: %s\n" +
                             "Upah\t\t\t: %.1f\n" +
                             "Pendapatan\t\t: Rp%.0f\n",
                             this.getNama(), this.getNoKTP(),
                             this.getUpah(), this.gaji());
    }

    public static void main(String[] args) {
        Pegawai jamal = new PegawaiTetap("Jamaludin", "3302141303900004", 5000000);
        Pegawai andar = new PegawaiTetap("Andara Adi", "33021411111900003", 6000000);
        Pegawai wati = new PegawaiTetap("Setyowati", "3302142706900001", 5000000);

        //cetak objek
        System.out.println(jamal);
        System.out.println(andar);
        System.out.println(wati);
    }
}
