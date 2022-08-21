package Praktikum8;

import java.util.*;

class TugasMod6_Kel15{

    // deklarasi atribut

    String NIM, Nama, Jurusan;
    int jari;
    double phi, luas;

    //setter
    public void setNama (String Nama){
        this.Nama = Nama;
    }
    public void setNIM (String NIM){
        this.NIM = NIM;
    }
    public void setJurusan (String Jurusan){
        this.Jurusan = Jurusan;
    }
    public void setjari (int jari){
        this.jari = 15+9;
    }
    public void setphi (Double phi){
        this.phi = 3.14;
    }

//    setluas dihapus, hitung luas di getluas

//    public void setluas (Double luas){
//        this.luas = phi * (15+9) * (15+9);
//    }

    //getter
    String getNama(){
        return Nama;
    }
    String getNIM(){
        return NIM;
    }
    String getJurusan(){
        return Jurusan;
    }
    int getjari(){
        return jari;
    }
    double getphi(){
        return phi;
    }
    double getluas(){
        return this.phi * this.jari * this.jari;
    }
}

public class Tugas_Kel15{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        // membuat object
        TugasMod6_Kel15 luas_lingkaran =new TugasMod6_Kel15();
        String Nama, NIM, Jurusan;

        System.out.println("---------Silahkan Masukkan Identitas---------");
        System.out.println("");
        System.out.print("Nama     : ");
        Nama = keyboard.nextLine();
        System.out.print("NIM      : ");
        NIM = input.nextLine();
        System.out.print("Jurusan  : ");
        Jurusan = keyboard.nextLine();

        luas_lingkaran.setNama(Nama);
        luas_lingkaran.setNIM(NIM);
        luas_lingkaran.setJurusan(Jurusan);
        luas_lingkaran.setjari(15+9);

        // tambah setphi
        luas_lingkaran.setphi(3.14);


        System.out.println(" ");
        System.out.println("----------Data----------");
        System.out.println("Nama    : "+luas_lingkaran.getNama());
        System.out.println("NIM     : "+luas_lingkaran.getNIM());
        System.out.println("Jurusan : "+luas_lingkaran.getJurusan());
        System.out.println(" ");

        System.out.println("---Program Menghitung Luas Lingkaran---");
        System.out.println("_____________");
        System.out.println("Jari-jari: " +luas_lingkaran.getjari());
        double Luas = luas_lingkaran.getluas();

        // System.out.println("Luas Lingkaran: "+ Luas);

        // mengurangi 0 setelah koma
        System.out.printf("Luas Lingkaran: %.1f", Luas);
        // %.1f = satu digit setelah koma
    }
}
