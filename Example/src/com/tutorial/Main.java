package com.tutorial;

import java.util.List;

class Mahasiswa{
    String nama;
    Peminjaman minjem;
}

class Peminjaman{
    Mahasiswa namanya;
    Buku buku;
    String tanggalPinjam;
    String tanggalKembali;

    String getPeminjam(){
        return namanya.nama;
    }

    String pinjamBuku(Buku buku){
        return this.buku.judul;
    }
}

class Buku{
    String judul;
    long nomor;
    String penerbit;
    int jumlah;
}

class KatalogBuku{
    List buku;
    Buku sr;

    void addBuku(String a, long b, String c, int d){

    }

    String search(Buku a){
        return a.judul;
    }
}

public class Main {

    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nama = "Johan";

        Peminjaman p1 = new Peminjaman();
        p1.namanya = m1;

        Buku b1 = new Buku();
        b1.judul = "Ibuku";

        System.out.println(m1.minjem.pinjamBuku(b1));



    }
}
