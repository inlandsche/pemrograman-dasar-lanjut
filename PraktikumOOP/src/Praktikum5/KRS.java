package Praktikum5;

public class KRS {
    private Mahasiswa mahasiswa;
    private MataKuliah[] matkul;

    private int totalSKS;
    private int i = 0;
    private int totalMatkul;

    KRS(){
        matkul = new MataKuliah[12];
    }

    void tambahMatkul(MataKuliah matkul){
        totalSKS += matkul.getSks();

        if (totalSKS <= 24){
            System.out.print("Info " + this.mahasiswa.getNim() + "\t: " + "Matkul berhasil ditambahkan\n");
            this.matkul[i] = matkul;
            i++;
            totalMatkul++;
        }
        else System.out.print("Info " + this.mahasiswa.getNim() + "\t: " + "Anda mencapai batas SKS\n");

    }

    void tampilKRS(){

        System.out.println("NIM\t\t\t\t: " + mahasiswa.getNim());
        System.out.println("Nama\t\t\t: " + mahasiswa.getNama());
        System.out.println("Prodi\t\t\t: " + mahasiswa.getProdi());
        System.out.println("Fakultas\t\t: " + mahasiswa.getFakultas());
        System.out.println("Mata Kuliah\t\t: ");

        for(int i = 0; i < totalMatkul; i++){

            System.out.print("* " + matkul[i].getKodeMatkul() + "-" + matkul[i].getNamaMatkul() + "-" +
                    matkul[i].getSks() + "SKS-" + matkul[i].getDosen().getNama() + "\n");
        }

        System.out.println();

    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public MataKuliah[] getMatkul() {
        return matkul;
    }

    public void setMatkul(int index) {
        matkul = new MataKuliah[index];
    }
}
