import java.util.ArrayList;

public class Bantuan <T> {
    private T jenis;
    private Donatur donatur;

    static ArrayList<Bantuan> listBantuan = new ArrayList<>();

    public void tambah(T jenis){
        this.jenis = jenis;

        listBantuan.add(new Bantuan(jenis));

        if (jenis instanceof Number){
            System.out.println("Terima kasih, " + donatur.getNama() + ". Anda telah berdonasi uang sebesar Rp" + jenis );
        }
        else
            System.out.println("Terima kasih, " + donatur.getNama() + ". Anda telah berdonasi " + jenis );
    }

    public Bantuan(T jenis) {
        this.jenis = jenis;
    }

    public Bantuan(){

    }

    public T getJenis() {
        return jenis;
    }

    public void setDonatur(Donatur donatur) {
        this.donatur = donatur;
    }

    public static void infoBantuan(){
        double totalUang = 0;
        int totalBarang = 0;

        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println("\t Informasi Bantuan Terkumpul");
        System.out.println("+++++++++++++++++++++++++++++++++++");

        for (int i = 0; i < listBantuan.size(); i++){
            if (listBantuan.get(i).jenis instanceof Number){
                totalUang += (Double) listBantuan.get(i).jenis;
                System.out.println((i+1) + ". Uang Rp" + listBantuan.get(i).jenis);
            }
            else{
                totalBarang++;
                System.out.println((i+1) + ". " + listBantuan.get(i).jenis);
            }
        }

        System.out.println("\n+++++++++++++++++++++++++++++++++++");
        System.out.println("Total Uang Terkumpul\t: Rp" + totalUang);
        System.out.println("Total Barang Terkumpul\t: " + totalBarang);

        System.out.println();
    }
}
