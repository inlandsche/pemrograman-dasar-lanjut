package Praktikum5;

public class Main {
    public static void main(String[] args) {
        Dosen[] daftarDosen = new Dosen[7];
        MataKuliah[] daftarMatkul = new MataKuliah[13];

        daftarDosen[0] = new Dosen("587455", "Sudianto", "Teknik Informatika", "Filkom");
        daftarDosen[1] = new Dosen("458522", "Yayan Jahian", "Teknik Informatika", "Filkom");
        daftarDosen[2] = new Dosen("599874", "Sumargo", "Teknik Informatika", "Filkom");
        daftarDosen[3] = new Dosen("174854", "Jamaludin", "Teknik Informatika", "Filkom");
        daftarDosen[4] = new Dosen("235985", "Suharyati", "Teknik Informatika", "Filkom");
        daftarDosen[5] = new Dosen("123","Aji Sulastri", "TIF", "FILKOM");
        daftarDosen[6] = new Dosen("124","Suratno", "TIF", "FILKOM");

        Mahasiswa mahasiswa1 = new Mahasiswa("195150620111007", "Ahmad", "SI", "FILKOM");
        Mahasiswa mahasiswa2 = new Mahasiswa("205120100111088", "Dummy James", "Teknik Informatika",
                "Fakultas Ilmu Komputer");

        daftarMatkul[0] = new MataKuliah("TIF12345", "Aljabar", 4, daftarDosen[0]);
        daftarMatkul[1] = new MataKuliah("TIF12333", "Statistika", 4, daftarDosen[1]);
        daftarMatkul[2] = new MataKuliah("TIF12321", "Sistem Operasi", 4, daftarDosen[3]);
        daftarMatkul[3] = new MataKuliah("TIF12543", "Pemrograman Lanjut", 5, daftarDosen[2]);
        daftarMatkul[4] = new MataKuliah("UB12561", "Kewarganegaraan", 3, daftarDosen[3]);
        daftarMatkul[5] = new MataKuliah("UB12467", "Kewirausahaan", 3, daftarDosen[1]);
        daftarMatkul[6] = new MataKuliah("TIF12921", "Algoritma Struktur Data", 4, daftarDosen[4]);

        daftarMatkul[7] = new MataKuliah("UBR001","PKN",5,daftarDosen[5]);
        daftarMatkul[8] = new MataKuliah("CIE006","PEMDAS",4,daftarDosen[5]);
        daftarMatkul[9] = new MataKuliah("CIE021","JARKOM",5,daftarDosen[6]);
        daftarMatkul[10] = new MataKuliah("CIE005","PEMWEB",5,daftarDosen[6]);
        daftarMatkul[11] = new MataKuliah("CIE005","Pancasila",5,daftarDosen[5]);
        daftarMatkul[12] = new MataKuliah("CIE005","Statistika",5,daftarDosen[5]);


        KRS krs1 = new KRS();

        mahasiswa1.setKRS(krs1);
        System.out.println("Mahasiswa 1\n");
        krs1.setMahasiswa(mahasiswa1);
        krs1.tambahMatkul(daftarMatkul[7]);
        krs1.tambahMatkul(daftarMatkul[8]);
        krs1.tambahMatkul(daftarMatkul[9]);
        krs1.tambahMatkul(daftarMatkul[10]);
        krs1.tambahMatkul(daftarMatkul[11]);
        krs1.tambahMatkul(daftarMatkul[12]);
        krs1.tampilKRS();


        KRS krs2 = new KRS();
        mahasiswa2.setKRS(krs2);



        System.out.println("Mahasiswa 2\n");
        krs2.tambahMatkul(daftarMatkul[1]);
        krs2.tambahMatkul(daftarMatkul[2]);
        krs2.tambahMatkul(daftarMatkul[3]);
        krs2.tambahMatkul(daftarMatkul[5]);
        krs2.tambahMatkul(daftarMatkul[0]);
        krs2.tambahMatkul(daftarMatkul[6]);
        krs2.tampilKRS();


    }
}
