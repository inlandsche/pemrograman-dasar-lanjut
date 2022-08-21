package Praktikum2;

public class Mahasiswa {
    String nama;
    String NIM;
    String alamat;
    String jenisKelamin;
    String prodi;
    double nilaiAkhir;

    static int totalMahasiswa = 0;
    final int KKM = 80;

    Mahasiswa(){
        totalMahasiswa++;
    }

    Mahasiswa(String nama, String NIM, String alamat, String jenisKelamin, String prodi, double nilaiAkhir){
        this.nama = nama;
        this.NIM = NIM;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
        this.prodi = prodi;
        this.nilaiAkhir = nilaiAkhir;
        totalMahasiswa++;
    }

    public static int totalMahasiswa(){
        return totalMahasiswa;
    }

    public String kelulusan(){
        if (this.nilaiAkhir < KKM) return "Mengulang";
        else return "Lulus";
    }

    public void info(){
        System.out.println("Nama\t\t\t: " + this.nama);
        System.out.println("NIM\t\t\t\t: " + this.NIM);
        System.out.println("Alamat\t\t\t: " + this.alamat);
        System.out.println("Jenis Kelamin\t: " + this.jenisKelamin);
        System.out.println("Program Studi\t: " + this.prodi);
        System.out.println("Nilai Akhir\t\t: " + this.nilaiAkhir);
        System.out.println("Kelulusan\t\t: " + this.kelulusan());
        System.out.println();
    }

    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nama = "Qolandar Annuri";
        m1.NIM = "205150200111058";
        m1.alamat = "Ajibarang Wetan";
        m1.jenisKelamin = "Laki-laki";
        m1.prodi = "Teknik Informatika";
        m1.nilaiAkhir = 90;

        m1.info();

        Mahasiswa m2 = new Mahasiswa("Zaenudin", "226138201111002", "Malang", "Laki-laki", "Teknik Komputer", 78);
        m2.info();

        System.out.println("Total Mahasiswa\t: " + Mahasiswa.totalMahasiswa());
    }
}

