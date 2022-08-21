package utp;

public class Pelanggan {
    private String nama;
    private String nomorPelanggan;
    private Buku[] BukuPinjaman = new Buku[3];

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorPelanggan() {
        return nomorPelanggan;
    }

    public void setNomorPelanggan(String nomorPelanggan) {
        this.nomorPelanggan = nomorPelanggan;
    }

    public Buku[] getBukuPinjaman() {
        return BukuPinjaman;
    }

    public void setBukuPinjaman(Buku[] bukuPinjaman) {
        BukuPinjaman = bukuPinjaman;
    }

    public Pelanggan(String nama, String nomorPelanggan, Buku[] bukuPinjaman) {
        this.nama = nama;
        this.nomorPelanggan = nomorPelanggan;
        BukuPinjaman = bukuPinjaman;
    }

    public Pelanggan(String nama, String nomorPelanggan){
        this.nama = nama;
        this.nomorPelanggan = nomorPelanggan;
    }

    public void tambahBuku(Buku bukuPinjam){

        for (int i = 0; i < this.BukuPinjaman.length; i++){
            if (this.BukuPinjaman[i] == null) {
                if (bukuPinjam.getJumlah() == 0) continue;
                else {

                    this.BukuPinjaman[i] = bukuPinjam;
                    break;
                }
            }
            else continue;
        }
    }

    public void tampilkanInfoPelanggan(){
        System.out.println("Nama\t\t\t\t: " + this.nama);
        System.out.println("Nomor Pelanggan\t\t: " + this.nomorPelanggan);
        System.out.println("Buku yang Dipinjam\t: ");

        for (int i = 0; i < this.BukuPinjaman.length; i++){
            if (BukuPinjaman[i] == null) break;
            else System.out.println(i+1 + " " + BukuPinjaman[i].getJudul());
        }
        System.out.println();
    }
}
