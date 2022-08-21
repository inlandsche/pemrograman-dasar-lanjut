package tugasAkhir;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bantuan {
    private double targetTerkumpul;
    private int targetWaktu;
    private String nama;
    private String jenis;
    private static Scanner in = new Scanner(System.in);

    static ArrayList<Bantuan> listBantuan = new ArrayList<>();

    public Bantuan(String nama, String jenis, double targetTerkumpul, int targetWaktu) {
        this.targetTerkumpul = targetTerkumpul;
        this.targetWaktu = targetWaktu;
        this.nama = nama;
        this.jenis = jenis;
    }

    public double getTargetTerkumpul() {
        return targetTerkumpul;
    }

    public void setTargetTerkumpul(double targetTerkumpul) {
        this.targetTerkumpul = targetTerkumpul;
    }

    public int getTargetWaktu() {
        return targetWaktu;
    }

    public void setTargetWaktu(int targetWaktu) {
        this.targetWaktu = targetWaktu;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public static void info(){
        for (int i = 0; i < listBantuan.size(); i++) {
            System.out.println("------------------ Bantuan " + (i+1) + " ---------------------");
            System.out.printf("|\t%-45s|\n", Bantuan.listBantuan.get(i).getNama());
            System.out.printf("|\tTarget terkumpul\t: %-23.1f|\n", Bantuan.listBantuan.get(i).getTargetTerkumpul());
            System.out.printf("|\tTarget waktu\t\t: %d hari%-16s|\n", Bantuan.listBantuan.get(i).getTargetWaktu(), "");
            System.out.println("--------------------------------------------------");
        }
    }

    public static void GalangBantuan() throws IOException {
        boolean yes = true;
        Bantuan bantuan;

        while (yes) {
            System.out.println("-------------- Penggalangan Bantuan --------------");
            System.out.print("Nama Bantuan\t: ");
            String nama = in.nextLine();
            System.out.println("--------------------------------------------------");

            System.out.println("Jenis Bantuan\t: ");
            System.out.println("[1] Uang");
            System.out.println("[2] Barang");
            System.out.print("Pilihan\t: ");
            int pilihanUser = in.nextInt();
            System.out.println("--------------------------------------------------");
            in.nextLine();

            String jenis = null;

            switch (pilihanUser) {
                case 1: jenis = "Bantuan Rupiah"; break;
                case 2: jenis = "Bantuan Barang"; break;
            }

            System.out.println("Target Terkumpul\t: ");
            double target = in.nextDouble();
            System.out.println("Target Waktu\t: ");
            int targetWaktu = in.nextInt();

            in.nextLine();
            System.out.print("Anda yakin akan menggalang bantuan? (y/n) : ");
            String yn = in.nextLine();

            if (yn.equalsIgnoreCase("y")){
                bantuan = new Bantuan(nama, jenis, target, targetWaktu);
                Bantuan.listBantuan.add(bantuan);

                try {
                    File dataPenggalangan = new File("dataPenggalangan.txt");

                    FileWriter writer = new FileWriter(dataPenggalangan, true);
                    BufferedWriter writeFile = new BufferedWriter(writer);

                    String save = nama + "," + jenis + "," + target + "," + targetWaktu;
                    writeFile.write(save);
                    writeFile.newLine();

                    writeFile.flush();
                    writeFile.close();

                } catch (Exception e){
                    e.printStackTrace();
                }

                System.out.println("Anda berhasil menambahkan Penggalangan Bantuan!");
                break;
            } else if (yn.equalsIgnoreCase("n")) break;
            else System.err.println("Input Anda salah!");
        }
    }

    public static void listPenggalangan(){
        try {
            FileReader reader = new FileReader("dataPenggalangan.txt");
            BufferedReader readFile = new BufferedReader(reader);

            String temp = readFile.readLine();

            while (temp != null) {
                StringTokenizer st = new StringTokenizer(temp, ",");

                String nama = st.nextToken();
                String jenis = st.nextToken();
                double target = Double.parseDouble(st.nextToken());
                int targetWaktu = Integer.parseInt(st.nextToken());

                Bantuan.listBantuan.add(new Bantuan(nama, jenis, target, targetWaktu));

                temp = readFile.readLine();
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
