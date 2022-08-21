package PraktikumOOP;

class Mobil{
    public String noPolisi;
    public String warna;
    public int tahun;
    public int hargaSewa;

    Mobil(String noPolisi, String warna, int tahun, int hargaSewa){
        this.noPolisi = noPolisi;
        this.warna = warna;
        this.tahun = tahun;
        this.hargaSewa = hargaSewa;
    }

    public String toString(){
        return "NoPolisi\t: " + this.noPolisi
                + "\nWarna\t\t: " + this.warna + "\nTahun\t\t: "
                + this.tahun + "\nHarga Sewa\t: Rp" + this.hargaSewa + "/hari";
    }
}

class Sopir{
    public String nama;
    public String alamat;
    private String noSIM;
    private int gajiHarian;
    public Mobil mobil;

    Sopir(String nama, String alamat, String noSIM, int gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.noSIM = noSIM;
        this.gajiHarian = gaji;
    }

    String getSIM(){
        return this.noSIM;
    }

    int infoGaji(){
        return this.gajiHarian;
    }

    void kendaraiMobil(Mobil mobil){
        this.mobil = mobil;
    }

    public String toString(){
        return "Nama\t\t: " + this.nama + "\nAlamat\t\t: "
                + this.alamat + "\nNoSIM\t\t: " + this.getSIM()
                + "\nGaji\t\t: Rp" + this.infoGaji() + "/ hari"
                + "\nNopol Mobil\t: " + this.mobil.noPolisi;
    }

}

class Pelanggan{
    private String nama;
    private String noKTP;
    private String alamat;
    public Mobil mobilPilihan;
    public Sopir sopir;

    Pelanggan(String nama, String noKTP, String alamat) {
        this.nama = nama;
        this.noKTP = noKTP;
        this.alamat = alamat;
    }

    String getNama(){
        return this.nama;
    }

    String getKTP(){
        return this.noKTP;
    }

    String getAlamat(){
        return this.alamat;
    }

    void pilihMobil(Mobil mobil){
        this.mobilPilihan = mobil;
    }

    void pilihSopir(Sopir namaSopir){
        this.sopir = namaSopir;
    }

    int bayar(){
        return this.mobilPilihan.hargaSewa;
    }

    public String toString(){
        return "Nama\t\t\t\t: " + this.getNama() + "\nAlamat\t\t\t\t: "
                + this.getAlamat() + "\nNo. KTP\t\t\t\t: " + this.getKTP()
                + "\nPlat Mobil Pilihan\t: " + this.mobilPilihan.noPolisi
                + "\nNama Sopir\t\t\t: " + this.sopir.nama + "\nBiaya\t\t\t\t: Rp"
                + this.bayar() + "/ hari";
    }
}

public class Travel {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("B 2332 OOP", "Hitam", 2019, 300000);
        Sopir sopir1 = new Sopir("Basri", "Jl. Jambu No. 23, Malang", "64873754", 100000);
        Pelanggan pelanggan1 = new Pelanggan("Jupri", "3302145678901234", "Jl. Kerikil No. 11, Kota Batu");

        pelanggan1.pilihMobil(mobil1);
        pelanggan1.pilihSopir(sopir1);
        pelanggan1.bayar();
        sopir1.kendaraiMobil(pelanggan1.mobilPilihan);

        System.out.println("Data Mobil\n");
        System.out.println(mobil1.toString());
        System.out.println();

        System.out.println("Identitas Sopir\n");
        System.out.println(sopir1.toString());
        System.out.println();

        System.out.println("Data Pelanggan\n");
        System.out.println(pelanggan1.toString());
    }
}
