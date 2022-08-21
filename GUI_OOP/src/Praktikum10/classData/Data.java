package Praktikum10.classData;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Data {
    public static ArrayList<Mahasiswa> mhs = new ArrayList<>();
    public static ArrayList<Dosen> dsn = new ArrayList<>();

    public static void initMahasiswa() throws IOException {
        File dir = new File("C:\\dataGUIQolandar/");
        if (!dir.exists()) dir.mkdir();

        File mhs = new File("C:\\dataGUIQolandar/mhs.txt");

        if(!mhs.exists()) mhs.createNewFile();


        Scanner in = new Scanner(mhs);
        while (in.hasNextLine()){
            Data.pecahMhs(in.nextLine());
        }
    }

    public static void pecahMhs(String data) throws IOException{
        StringTokenizer st = new StringTokenizer(data, "-");

        String nim = st.nextToken();
        String nama = st.nextToken();
        String prodi = st.nextToken();
        String fakultas = st.nextToken();

        mhs.add(new Mahasiswa(nim, nama, prodi, fakultas));
    }

    public static void simpanMhs() throws IOException{
        FileWriter writer = new FileWriter("C:\\dataGUIQolandar/mhs.txt");

        for (Mahasiswa mahasiswa : mhs){
            String save = String.format("%s-%s-%s-%s", mahasiswa.getNim(), mahasiswa.getNama(),
                          mahasiswa.getProdi(), mahasiswa.getFakultas());

            writer.write(save + "\n");
        }

        writer.flush();
        writer.close();
    }

    public static void initDosen() throws IOException{
        File dir = new File("C:\\dataGUIQolandar/");
        if (!dir.exists()) dir.mkdir();

        File dsn = new File("C:\\dataGUIQolandar/dsn.txt");
        if (!dsn.exists()) dsn.createNewFile();

        Scanner in = new Scanner(dsn);
        while (in.hasNextLine()){
            Data.pecahDsn(in.nextLine());
        }
    }

    public static void pecahDsn(String data) throws IOException{
        StringTokenizer st = new StringTokenizer(data, "-");

        String nip = st.nextToken();
        String nama = st.nextToken();
        String prodi = st.nextToken();
        String fakultas = st.nextToken();

        dsn.add(new Dosen(nip, nama, prodi, fakultas));
    }

    public static void simpanDsn() throws IOException{
        FileWriter writer = new FileWriter("C:\\dataGUIQolandar/dsn.txt");

        for (Dosen dosen : dsn){
            String save = String.format("%s-%s-%s-%s", dosen.getNip(), dosen.getNama(),
                    dosen.getProdi(), dosen.getFakultas());

            writer.write(save + "\n");
        }

        writer.flush();
        writer.close();
    }

}
