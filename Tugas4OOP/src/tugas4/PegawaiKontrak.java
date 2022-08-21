package tugas4;

public class PegawaiKontrak extends Pegawai{
    private int HonorHarian;

    PegawaiKontrak(String alamat, String nama, String unitKerja) {
        super(alamat, nama, unitKerja);
    }

    void setHonorHarian(int HonorHarian){
        this.HonorHarian = HonorHarian;
    }
}
