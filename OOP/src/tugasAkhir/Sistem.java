package tugasAkhir;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Sistem {

    static Scanner in = new Scanner(System.in);

    public static void register() throws IOException {
        String nama, username, password;

        File info = new File("Info.txt");

        FileWriter writer = new FileWriter(info, true);
        BufferedWriter writeFile = new BufferedWriter(writer);

        System.out.println("------------------- Registrasi ------------------");
        System.out.print("Nama Lengkap\t: ");
        nama = in.nextLine();
        System.out.println("-------------------------------------------------");
        System.out.print("Username\t\t: ");
        username = in.nextLine();
        System.out.println("-------------------------------------------------");
        System.out.print("Password\t\t: ");
        password = in.nextLine();
        System.out.println("-------------------------------------------------");

        System.out.println("Registrasi Anda Berhasil, silahkan Login untuk melanjutkan!");

        String save = nama + "," + username + "," + password;

        writeFile.write(save);
        writeFile.newLine();
        writeFile.flush();

        writeFile.close();
    }

    public static boolean login() throws IOException {
        String username, password;
        System.out.println("--------------------- Login ---------------------");
        System.out.print("Username\t: ");
        username = in.nextLine();
        System.out.println("-------------------------------------------------");
        System.out.print("Password\t: ");
        password = in.nextLine();
        System.out.println("-------------------------------------------------");

        FileReader reader = new FileReader("info.txt");
        BufferedReader readFile = new BufferedReader(reader);

        String dataLogin = readFile.readLine();

        while (dataLogin != null) {
            StringTokenizer stoken = new StringTokenizer(dataLogin, ",");

            String nama = stoken.nextToken();
            String user = stoken.nextToken();
            String pass = stoken.nextToken();

            if (username.equals(user) && password.equals(pass)) {
                System.out.println("Selamat datang, " + nama + "\n");

                User.listUser.add(new User(nama));

                return true;
            }

            dataLogin = readFile.readLine();
        }

        System.err.println("Username atau Password Salah!!");
        return false;
    }

    public static void Menu() throws IOException{
        boolean yes = true;

        while (yes) {
            System.out.println("--------------------- Menu ----------------------\n");
            System.out.println("1.\tBerdonasi");
            System.out.println("2.\tGalang Bantuan");
            System.out.println("3.\tInfo Donatur");
            System.out.println("4.\tLog Out\n");
            System.out.print("Pilihan\t: ");
            int pilihanUser = in.nextInt();
            in.nextLine();
            System.out.println();

            switch (pilihanUser) {
                case 1:
                    System.out.println("---------- DAFTAR PENGGALANGAN BANTUAN -----------\n");

                    if (Bantuan.listBantuan.size() == 0)
                        Bantuan.listPenggalangan();

                    Bantuan.info();

                    donasi(User.listUser.get(User.listUser.size() - 1));

                    break;
                case 2:
                    Bantuan.GalangBantuan();
                    break;
                case 3:
                    listDonatur();
                    break;
                case 4:
                    MainMenu();
                default: yes = false;
            }
        }
    }

    public static void MainMenu() throws IOException{
        boolean yes = true;

        while (yes) {
            System.out.println("----------------- Pusat Bantuan -----------------\n");
            System.out.println("[1]\tRegister");
            System.out.println("[2]\tLogin");
            System.out.println("[3]\tKeluar");

            System.out.println();
            System.out.print("Pilihan\t: ");
            int pilihanUser = in.nextInt();
            in.nextLine();
            System.out.println();

            switch (pilihanUser) {
                case 1:
                    Sistem.register();
                    break;
                case 2:
                    if (Sistem.login()){
                        yes = false;
                        Sistem.Menu();
                    } else yes = true;
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.err.println("Input salah!");
                    yes = false;
            }
        }
    }

    public static void donasi(User user){
        System.out.print("Pilihan Bantuan\t: ");
        int pilihanUser = in.nextInt();

        if (pilihanUser <= Bantuan.listBantuan.size() && pilihanUser > 0){
            System.out.print("Nominal Bantuan\t: ");
            double banyak = in.nextDouble();

            System.out.println("Terima kasih telah berdonasi!");
            user.berdonasi(pilihanUser, banyak);
        } else System.out.println("Bantuan tidak ditemukan!");


        try{
            BufferedWriter writeFile = new BufferedWriter(new FileWriter(new File("dataDonasi.txt"), true));

            for (var data : Donasi.listDonasi){
                String save = data.user.getNama() + "|" + data.getDonasi() + "|" + data.bantuan.getNama();

                writeFile.write(save);
                writeFile.newLine();
                writeFile.flush();
            }

            writeFile.close();

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void listDonatur(){
        try {
            BufferedReader readFile = new BufferedReader(new FileReader("dataDonasi.txt"));

            String temp = readFile.readLine();

            System.out.println("-------------------------------------------------");
            System.out.printf("%-12s", "Donatur");
            System.out.printf("%-13s", "Nominal");
            System.out.printf("%s", "Bantuan");
            System.out.println();
            System.out.println("-------------------------------------------------");

            while (temp != null){
                StringTokenizer st = new StringTokenizer(temp, "|");

                String nama = st.nextToken();
                double nominal = Double.parseDouble(st.nextToken());
                String bantuan = st.nextToken();

                System.out.printf("%-12s", nama);
                System.out.printf("%-13.0f", nominal);
                System.out.printf("%s\n", bantuan);

                temp = readFile.readLine();
            }

            readFile.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("-------------------------------------------------\n");

    }

}
