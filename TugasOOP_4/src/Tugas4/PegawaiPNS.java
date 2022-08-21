package Tugas4;

public class PegawaiPNS extends Pegawai{
    private int GajiPokok;
    private int HonorLembur;
    private int UangMakan;

    PegawaiPNS(String alamat, String nama, String unitKerja){
        super(alamat, nama, unitKerja);
    }

    void BuatLaporanKerja(){
        System.out.println("Pegawai PNS membuat laporan kerja target capaian pegawai tahunan");
    }

    void setGajiPokok(int gajiPokok) {
        GajiPokok = gajiPokok;
    }

    void setHonorLembur(int honorLembur) {
        HonorLembur = honorLembur;
    }

    void setUangMakan(int uangMakan) {
        UangMakan = uangMakan;
    }
}
