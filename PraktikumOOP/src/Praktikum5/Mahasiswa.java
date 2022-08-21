package Praktikum5;

public class Mahasiswa extends CivitasAkademik{
    private String nim;
    private KRS krs;

    Mahasiswa(){}

    public Mahasiswa(String nim, String nama, String prodi, String fakultas) {
        super(nama, prodi, fakultas);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setKRS(KRS krs){
        this.krs = krs;
        krs.setMahasiswa(this);
    }

    public KRS getKRS(){
        return this.krs;
    }
}
