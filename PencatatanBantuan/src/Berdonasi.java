import java.util.*;

public class Berdonasi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Bantuan bantuan = new Bantuan();

        Bantuan<String> bantuanLain = new Bantuan<>();
        Bantuan<Double> bantuanUang = new Bantuan<>();

        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("\t   Pendataan Donasi");
        System.out.println("+++++++++++++++++++++++++++++\n");
        System.out.print("Nama Anda\t: ");
        String inputNama = in.nextLine();


        Donatur d1 = new Donatur(inputNama);
        d1.setBantuanLain(bantuanLain);
        d1.setBantuanUang(bantuanUang);

        while (true) {
            Menu();
            System.out.print("Pilihan\t: ");
            int pilihan = in.nextInt();
            in.nextLine();
            System.out.println();

            switch (pilihan) {
                case 1:
                    System.out.println("Donasi dapat berupa uang ataupun barang");
                    System.out.println("1. Uang");
                    System.out.println("2. Pakaian layak pakai");
                    System.out.println("3. Obat-obatan");
                    System.out.println("4. Lainnya\n");

                    System.out.print("Pilihan\t: ");
                    int pil = in.nextInt();
                    in.nextLine();


                    switch (pil){
                        case 1 :
                            System.out.print("Masukkan nominal\t: ");
                            double uang = in.nextInt();

                            d1.berdonasi(uang);
                            break;
                        case 2 :
                            d1.berdonasi("Pakaian layak pakai");
                            break;
                        case 3 :
                            d1.berdonasi("Obat - obatan");
                            break;
                        case 4 :
                            System.out.print("Donasi\t: ");
                            String donasi = in.nextLine();
                            d1.berdonasi(donasi);
                            break;
                    }

                    break;
                case 2:
                    Bantuan.infoBantuan();
                    break;
                case 3:
                    return;
            }
        }

    }

    public static void Menu(){
        System.out.println("\nApa yang ingin Anda lakukan?");
        System.out.println("1. Berdonasi");
        System.out.println("2. Informasi Donasi Terkumpul");
        System.out.println("3. Keluar");
        System.out.println();
    }
}
