package tugas4;

public class PejabatDinas extends PegawaiPNS{
    private String MasaJabatan;
    private String NamaJabatan;
    private int TunjanganJabatan;

    PejabatDinas(String alamat, String nama, String unitKerja){
        super(alamat, nama, unitKerja);
    }

    void setTunjanganJabatan(int tunjanganJabatan) {
        this.TunjanganJabatan = tunjanganJabatan;
    }

    void BuatLaporanKerja(int param){
        System.out.println("Pejabat dinas memiliki target " + param + " persen");
    }
}
