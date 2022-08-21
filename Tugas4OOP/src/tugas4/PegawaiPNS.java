package tugas4;

public class PegawaiPNS extends Pegawai{
    private int GajiPokok;
    private int HonorLembur;
    private int UangMakan;

    PegawaiPNS(String alamat, String nama, String unitKerja){
        super(alamat, nama, unitKerja);
    }

    void BuatLaporanKerja(int param){
        System.out.println("Tahun ini target capaian pegawai adalah 5 persen" );
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
