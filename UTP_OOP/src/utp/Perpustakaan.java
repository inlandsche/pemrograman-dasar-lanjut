package utp;

public class Perpustakaan {
    Buku[] listBuku = new Buku[100];
    public Pegawai pegawaiPerpus;
    public Pelanggan listPelanggan[] = new Pelanggan[20];

    Perpustakaan(Pegawai pegawai){
        this.pegawaiPerpus = pegawai;
    }

    void pinjam(String namaPelanggan, String judulBuku){
        Buku temp = null;
        int jumlah = 0;

        for (int i = 0; i < listBuku.length; i++){
            if (judulBuku.equalsIgnoreCase(listBuku[i].getJudul()))
                temp = listBuku[i];
            break;
        }


        for (int i = 0; i < listPelanggan.length; i++){
            if (namaPelanggan.equalsIgnoreCase(listPelanggan[i].getNama())) {
                listPelanggan[i].tambahBuku(temp);
                break;
            }
        }
    }

    Buku cariBuku(String judulBuku){
        Buku temp = null;

        for (int i = 0; i < listBuku.length; i++){
            if (judulBuku.equalsIgnoreCase(listBuku[i].getJudul()))
                temp = listBuku[i];
            break;
        }
        return temp;
    }

    void tampilkanInfoPerpustakaan(){
        pegawaiPerpus.tampilkanInfoPegawai();

        for (int i = 0; i < listPelanggan.length; i++){
            if (listPelanggan[i] != null)
                listPelanggan[i].tampilkanInfoPelanggan();
            else break;
        }

        System.out.println("==============================");
        System.out.println("Daftar Buku Pada Perpustakaan\n");
        for (int i = 0; i < listBuku.length; i++){
            if (listBuku[i] != null){
                listBuku[i].tampilkanInfoBuku();
            }
        }
    }
}
