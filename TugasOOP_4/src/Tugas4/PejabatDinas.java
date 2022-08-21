package Tugas4;

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

    void BuatLaporanKerja() {
        System.out.println("Pejabat Dinas membuat laporan kerja target capaian pegawai tahunan dengan target capaian dinas yang dipimpin");
    }
}
