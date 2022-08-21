import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    public static ArrayList<Tanaman> tanamans = new ArrayList<>();
    public static ArrayList<Integer> lokasi = new ArrayList<>();

    public static Scanner in = new Scanner(System.in);

    public static void mulai(){
        System.out.print("Masa tanam (bulan)\t: ");
        int input = in.nextInt();
        int hari = input * 30;

        for (int i = 0; i < 3; i++){
            menanam();
        }

        for (int i = 0; i < hari; i++){
            for (int j = 0; j < tanamans.size(); j++){

                if (lokasi.contains(j)){
                    continue;
                }

                if (tanamans.get(j).status().equals("Hidup")){
                    tanamans.get(j).berkembang();

                    if (i % 90 == 0){
                        ((Perawatan) tanamans.get(j)).treatment();
                    }
                }

                else if (tanamans.get(j).status().equals("Mati")){
                    lokasi.add(j);
                    System.out.printf("Tanaman %s telah mati.\n", tanamans.get(j).getClass().getSimpleName());
                    menanam();
                }

            }
        }

    }

    public static void menanam(){
        System.out.println("Mau menanam apa?");
        System.out.println("1. Tomat");
        System.out.println("2. Stroberi");
        System.out.println("3. Persik");
        int pilihan = in.nextInt();

        switch (pilihan){
            case 1 :
                System.out.println("Tomat berhasil ditanam!");
                tanamans.add(new Tomat());
                break;
            case 2 :
                System.out.println("Stroberi berhasil ditanam!");
                tanamans.add(new Stroberi());
                break;
            case 3 :
                System.out.println("Persik berhasil ditanam!");
                tanamans.add(new Persik());
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }

    public static void info(){
        System.out.println("++++++ Hasil Menanam ++++++\n");

        for (int i = 0; i < tanamans.size(); i++){
            System.out.println("Tanaman buah ke-" + (i + 1));

            System.out.println(tanamans.get(i).toString());
        }
    }
}
