package utp;

public class Pegawai {
    private String nama;
    private String nomorPegawai;

    Perpustakaan perpustakaan;

    public Pegawai(String nama, String nomorPegawai) {
        this.nama = nama;
        this.nomorPegawai = nomorPegawai;
    }

    public void setPerpustakaan(Perpustakaan perpustakaan){
        this.perpustakaan = perpustakaan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorPegawai() {
        return nomorPegawai;
    }

    public void setNomorPegawai(String nomorPegawai) {
        this.nomorPegawai = nomorPegawai;
    }

    public void tampilkanInfoPegawai(){
        System.out.println("Nama\t\t\t: " + this.nama);
        System.out.println("Nomor Pegawai\t: " + this.nomorPegawai);
        System.out.println("=============================");
        System.out.println();

    }

    public void menambahPelanggan(String nama, String nomorPelanggan){
        Pelanggan pelangganBaru = new Pelanggan(nama, nomorPelanggan);

        for (int i = 0; i < perpustakaan.listPelanggan.length; i++){
            if (perpustakaan.listPelanggan[i] == null) {
                perpustakaan.listPelanggan[i] = pelangganBaru;
                break;
            }
            else continue;
        }
    }

    public void menambahBuku(String judul, String penulis, int jumlah){
        Buku tambah = new Buku(judul, penulis, jumlah);

        for (int i = 0; i < perpustakaan.listBuku.length; i++) {
            if (perpustakaan.listBuku[i] != null){
                if (perpustakaan.listBuku[i].equals(tambah.getJudul()))
                    continue;
            }
            else {
                perpustakaan.listBuku[i] = tambah;
                break;
            }
        }
    }
}
