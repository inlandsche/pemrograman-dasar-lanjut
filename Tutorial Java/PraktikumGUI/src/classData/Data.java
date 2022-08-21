/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classData;


import java.io.*;
import java.util.*;

/**
 *
 * @author Qolandar
 */
public class Data {
    public static ArrayList<Mahasiswa> mhs = new ArrayList<>();
    private static ArrayList<Dosen> dsn = new ArrayList<>();

    public static void initMahasiswa() throws IOException {
        File mhs = new File("src/data/mhs.txt");
        
        if(!mhs.exists()) mhs.createNewFile();

        Scanner in = new Scanner(mhs);
        while (in.hasNextLine()){
            pecahMhs(in.nextLine());
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
        FileWriter writer = new FileWriter("src/data/mhs.txt", true);

        for (Mahasiswa mahasiswa : mhs){
            String save = String.format("%s-%s-%s-%s", mahasiswa.getNim(), mahasiswa.getNama(),
                          mahasiswa.getProdi(), mahasiswa.getFakultas());

            writer.write(save + "\n");
            writer.flush();
        }

        writer.close();
    }

    public static void initDosen(){
        File dsn = new File("dsn.txt");
    }

    public static void pecahDsn(String data) throws IOException{
        FileReader reader = new FileReader("dsn.txt");
        BufferedReader readFile = new BufferedReader(reader);

        String temp = readFile.readLine();
        StringTokenizer st = new StringTokenizer(temp, "-");

        while (temp != null){
            String nip = st.nextToken();
            String nama = st.nextToken();
            String prodi = st.nextToken();
            String fakultas = st.nextToken();

            if (nama.equals(data)){
                dsn.add(new Dosen(nip, nama, prodi, fakultas));
                break;
            }

            temp = readFile.readLine();
        }

        reader.close();
    }

    public static void simpanDsn() throws IOException{
        FileWriter writer = new FileWriter("dsn.txt", true);

        for (Dosen dosen : dsn){
            String save = String.format("%s-%s-%s-%s", dosen.getNip(), dosen.getNama(),
                    dosen.getProdi(), dosen.getFakultas());

            writer.write(save + "\n");
            writer.flush();
        }

        writer.close();
    }
}
