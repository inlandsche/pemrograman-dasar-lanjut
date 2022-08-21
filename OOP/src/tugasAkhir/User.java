package tugasAkhir;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class User {
    static ArrayList<User> listUser = new ArrayList<>();

    private Bantuan bantuan;
    private String nama;

    public User(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void berdonasi(int pilihan, double banyak){
        for (int i = 0; i < Bantuan.listBantuan.size(); i++){
            if (pilihan <= Bantuan.listBantuan.size() && pilihan > 0){
                this.bantuan = Bantuan.listBantuan.get(pilihan - 1);
                break;
            } else System.out.println("Bantuan tidak ditemukan!");
        }

        Donasi.listDonasi.add(new Donasi(bantuan, banyak, this));
        double target = bantuan.getTargetTerkumpul();
        target -= banyak;
        bantuan.setTargetTerkumpul(target);


        try {
            BufferedWriter writeFile = new BufferedWriter(new FileWriter("dataPenggalangan.txt"));

            for (var dataBantuan : Bantuan.listBantuan){
                String nama = dataBantuan.getNama();
                String jenis = dataBantuan.getJenis();
                String targetTerkumpul = String.valueOf(dataBantuan.getTargetTerkumpul());
                String targetWaktu = String.valueOf(dataBantuan.getTargetWaktu());

                String save = nama + "," + jenis + "," + targetTerkumpul + "," + targetWaktu;

                writeFile.write(save);
                writeFile.newLine();
                writeFile.flush();
            }

           writeFile.close();

        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println();
    }
}
