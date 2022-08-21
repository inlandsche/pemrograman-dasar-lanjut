package Praktikum9;

import java.util.ArrayList;

public class AktivitasPencatatan <T extends Furniture> {
    ArrayList<T> listBarangTerjual = new ArrayList<>();

    public void tambahList(T barang){
        listBarangTerjual.add(barang);
    }

    public void rekapitulasi(){
        double totalHarga = 0;
        double totalBerat = 0;

        System.out.println("                        REKAPITULASI HASIL PENJUALAN FURNITURE                            ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("%-10s", "Kode");
        System.out.printf("%-30s", "Nama Barang");
        System.out.printf("%-18s", "Berat Barang");
        System.out.printf("%-19s", "Jenis Barang");
        System.out.printf("%-10s\n", "Harga");
        System.out.println("------------------------------------------------------------------------------------------");

        for (var barang : listBarangTerjual){
            System.out.printf("%-10s", barang.getKodeBarang());
            System.out.printf("%-30s", barang.getNamaBarang());
            System.out.printf("%-18s", barang.getBeratBarang() + " kg");
            System.out.printf("%-19s", barang.getJenisBarang());
            System.out.printf("Rp%-10s", barang.getHargaBarang());
            System.out.printf("\n");

            totalBerat += barang.getBeratBarang();
            totalHarga += barang.getHargaBarang();
        }

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("%-10s", "TOTAL");
        System.out.printf("%-30s", "");
        System.out.printf("%-18s", totalBerat + " kg");
        System.out.printf("%-19s", "");
        System.out.printf("Rp%-10s\n", totalHarga);
    }
}
