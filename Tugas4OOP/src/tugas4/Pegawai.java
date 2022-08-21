package tugas4;

public class Pegawai {
    private String alamat;
    private String nama;
    private String unitKerja;

    Pegawai(String alamat, String nama, String unitKerja) {
        this.alamat = alamat;
        this.nama = nama;
        this.unitKerja = unitKerja;
    }

    void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    void setUnitKerja(String unitKerja) {
        this.unitKerja = unitKerja;
    }

    void BuatLaporanKerja(int param){
        System.out.println("Tahun ini target capaian pegawai adalah 5 persen" );
    }
}
