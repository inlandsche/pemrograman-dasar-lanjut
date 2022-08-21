package Praktikum5;

import java.util.Scanner;

public class Interaktif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // deklarasi array of object
        Dosen[] dosen = new Dosen[5];
        Mahasiswa[] mahasiswa = new Mahasiswa[10];
        MataKuliah[] matkul = new MataKuliah[7];
        KRS[] krs = new KRS[10];



        while (true) {
            // list menu
            System.out.println("======== MENU ========\n");
            System.out.println("1. Tambah Dosen");
            System.out.println("2. Tambah Mahasiswa");
            System.out.println("3. Tambah Mata Kuliah");
            System.out.println("4. Buat KRS");
            System.out.println("5. Tampil Daftar Dosen");
            System.out.println("6. Tampil Daftar Mahasiswa");
            System.out.println("7. Tampil Daftar Matkul");
            System.out.println("8. Cetak KRS Mahasiswa");
            System.out.println("9. Keluar\n");

            // input pilihan user
            System.out.print("Pilihan : ");
            int pilihan = in.nextInt();
            in.nextLine();

            String inputNama;
            String inputID;
            String inputProdi;
            String inputFakultas;
            String pilih;


            int jumlahSKS;


            if (pilihan == 1) {
                System.out.println();
                System.out.println("==== TAMBAH DOSEN ====\n");
                System.out.print("Masukkan Nama\t\t: ");
                inputNama = in.nextLine();
                System.out.print("Masukkan NIDN\t\t: ");
                inputID = in.nextLine();
                System.out.print("Masukkan Prodi\t\t: ");
                inputProdi = in.nextLine();
                System.out.print("Masukkan Fakultas\t: ");
                inputFakultas = in.nextLine();

                Dosen tambah = new Dosen(inputID, inputNama, inputProdi, inputFakultas);

                for (int i = 0; i < dosen.length; i++){
                    if (dosen[i] != null) continue;

                    else {
                        dosen[i] = tambah;
                        System.out.println("Anda berhasil menambahkan data dosen\n");
                        break;
                    }

                }

                System.out.print("Apakah ingin kembali ke MENU? (y/n) : ");
                pilih = in.nextLine();

                if (pilih.equals("n")) break;
                System.out.println();

            } else if (pilihan == 2) {
                System.out.println();
                System.out.println("==== TAMBAH MAHASISWA ====\n");
                System.out.print("Masukkan Nama\t\t: ");
                inputNama = in.nextLine();
                System.out.print("Masukkan NIM\t\t: ");
                inputID = in.nextLine();
                System.out.print("Masukkan Prodi\t\t: ");
                inputProdi = in.nextLine();
                System.out.print("Masukkan Fakultas\t: ");
                inputFakultas = in.nextLine();

                Mahasiswa tambah = new Mahasiswa(inputID, inputNama, inputProdi, inputFakultas);

                for (int i = 0; i < mahasiswa.length; i++){
                    if (mahasiswa[i] != null) continue;

                    else {
                        mahasiswa[i] = tambah;
                        System.out.println("Anda berhasil menambahkan data mahasiswa\n");
                        break;
                    }

                }

                System.out.print("Apakah ingin kembali ke MENU? (y/n) : ");
                pilih = in.nextLine();

                if (pilih.equals("n")) break;
                System.out.println();

            } else if (pilihan == 3) {
                System.out.println();
                System.out.println("==== TAMBAH MATKUL ====\n");
                System.out.print("Masukkan Kode Matkul\t: ");
                inputNama = in.nextLine();
                System.out.print("Masukkan Nama Matkul\t: ");
                inputID = in.nextLine();
                System.out.print("Masukkan Jumlah SKS\t\t: ");
                jumlahSKS = in.nextInt();
                in.nextLine();
                System.out.print("Nama Dosen Pengajar\t\t: ");
                String inputDosen = in.nextLine();

                Dosen input = new Dosen();

                for (int i = 0; i < dosen.length; i++){
                    if (inputDosen.equalsIgnoreCase(dosen[i].getNama())){
                        input = dosen[i];
                        break;
                    }
                }

                MataKuliah tambah = new MataKuliah(inputID, inputNama, jumlahSKS, input);

                for (int i = 0; i < matkul.length; i++){
                    if (matkul[i] != null) continue;
                    else {
                        matkul[i] = tambah;
                        System.out.println("Anda berhasil menambahkan mata kuliah\n");
                        break;
                    }

                }

                System.out.print("Apakah ingin kembali ke MENU? (y/n) : ");
                pilih = in.nextLine();

                if (pilih.equals("n")) break;
                System.out.println();

            } else if (pilihan == 4) {
                System.out.println();
                System.out.println("==== BUAT KRS ====");
                KRS tambah = new KRS();

                for (int i = 0; i < krs.length; i++){
                    if (krs[i] != null) continue;
                    else {
                        krs[i] = tambah;
                        break;
                    }
                }

                System.out.print("Masukkan NIM Anda : ");
                inputID = in.nextLine();

                for (int i = 0; i < mahasiswa.length; i++){
                    if (inputID.equals(mahasiswa[i].getNim())){
                        mahasiswa[i].setKRS(tambah);
                        break;
                    }
                }

                System.out.println();
                System.out.println("Silahkan memilih mata kuliah\n");

                int i = 0;
                while (matkul[i] != null){
                    System.out.println("Mata Kuliah " + (i+1));
                    System.out.println("+++++++++++++++++++++++++++++++");
                    System.out.println("Nama Matkul\t\t: " + matkul[i].getNamaMatkul());
                    System.out.println("Kode Matkul\t\t: " + matkul[i].getKodeMatkul());
                    System.out.println("Jumlah SKS\t\t: " + matkul[i].getSks());
                    System.out.println("Pengajar\t\t: " + matkul[i].getDosen().getNama());
                    System.out.println("+++++++++++++++++++++++++++++++\n");
                    i++;
                }

                while (true) {
                    System.out.print("Pilihan : ");
                    int pil = in.nextInt();
                    in.nextLine();

                    for (int j = 0; j < matkul.length; j++) {
                        if ((pil - 1) == j) tambah.tambahMatkul(matkul[j]);
                    }

                    System.out.print("Ingin menambah matkul lagi? (y/n) : ");
                    String nambah = in.nextLine();

                    if (nambah.equalsIgnoreCase("n")) break;
                }


            } else if (pilihan == 5) {
                int i = 0;

                System.out.println("++++++++++++++");
                System.out.println("Data Dosen");
                System.out.println("++++++++++++++\n");

                while (dosen[i] != null){
                    System.out.println("Dosen " + (i+1));
                    System.out.println("+++++++++++++++++++++++++++++++");
                    System.out.println("Nama\t\t: " + dosen[i].getNama());
                    System.out.println("NIDN\t\t: " + dosen[i].getNidn());
                    System.out.println("Prodi\t\t: " + dosen[i].getProdi());
                    System.out.println("Fakultas\t: " + dosen[i].getFakultas());
                    System.out.println("++++++++++++++++++++++++++++++++\n");
                    i++;
                }

            } else if (pilihan == 6) {
                int i = 0;

                System.out.println("++++++++++++++");
                System.out.println("Data Mahasiswa");
                System.out.println("++++++++++++++\n");

                while (mahasiswa[i] != null){
                    System.out.println("Mahasiswa " + (i+1));
                    System.out.println("+++++++++++++++++++++++++++++++");
                    System.out.println("Nama\t\t: " + mahasiswa[i].getNama());
                    System.out.println("NIM\t\t\t: " + mahasiswa[i].getNim());
                    System.out.println("Prodi\t\t: " + mahasiswa[i].getProdi());
                    System.out.println("Fakultas\t: " + mahasiswa[i].getFakultas());
                    System.out.println("+++++++++++++++++++++++++++++++\n");
                    i++;
                }

            } else if (pilihan == 7) {
                int i = 0;

                System.out.println("++++++++++++++");
                System.out.println("Data Mata Kuliah");
                System.out.println("++++++++++++++\n");

                while (matkul[i] != null){
                    System.out.println("Mata Kuliah " + (i+1));
                    System.out.println("+++++++++++++++++++++++++++++++");
                    System.out.println("Nama Matkul\t\t: " + matkul[i].getNamaMatkul());
                    System.out.println("Kode Matkul\t\t: " + matkul[i].getKodeMatkul());
                    System.out.println("Jumlah SKS\t\t: " + matkul[i].getSks());
                    System.out.println("Pengajar\t\t: " + matkul[i].getDosen().getNama());
                    System.out.println("+++++++++++++++++++++++++++++++\n");
                    i++;
                }
            } else if (pilihan == 8) {
                System.out.println("+++++++++++++++++++++++++++++++");
                System.out.print("Masukkan NIM : ");
                inputID = in.nextLine();
                System.out.println("+++++++++++++++++++++++++++++++\n");

                for (int i = 0; i < mahasiswa.length; i++){
                    if (inputID.equals(mahasiswa[i].getNim())){
                        mahasiswa[i].getKRS().tampilKRS();
                        break;
                    }
                }
            } else break;

        }
    }


}
