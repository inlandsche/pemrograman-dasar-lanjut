package praktikum6;

public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public double gaji() {
        double gajiPokok = this.upahPerJam * totalJam;
        double gajiLembur = (this.getTotalJam() - 40) * (this.getUpahPerJam() * 1.5);

        if (this.totalJam <= 40){
            return gajiPokok;
        }
        else{
            gajiPokok = this.upahPerJam * 40;
            return gajiPokok + gajiLembur;
        }
    }

    @Override
    public String toString() {
        return String.format("++++++++++++++++++++++++++++" +
                             "\n\t   Pegawai Harian" +
                             "\n++++++++++++++++++++++++++++\n" +
                             "Nama\t\t\t: %s\n" +
                             "No. KTP\t\t\t: %s\n" +
                             "Upah/jam\t\t: %.1f\n" +
                             "Total jam kerja\t: %d\n" +
                             "Pendapatan\t\t: Rp%.0f\n",
                             this.getNama(), this.getNoKTP(),
                             this.getUpahPerJam(), this.getTotalJam(),
                             this.gaji());
    }

    public static void main(String[] args) {

        //pembuatan objek
        Pegawai anas = new PegawaiHarian("Anas Siana", "3302140101910001", 10000, 45);
        Pegawai buni = new PegawaiHarian("Arbuni Jamali", "3302140702920002", 11000, 50);
        Pegawai sari = new PegawaiHarian("Sarira Sukmawati", "3302141207970007", 12000, 35);

        //cetak objek
        System.out.println(anas);
        System.out.println(buni);
        System.out.println(sari);
    }
}
