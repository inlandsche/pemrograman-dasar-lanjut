package Praktikum9;

public class TokoFurniture {
    public static void main(String[] args) {
        PerabotKayu meja = new PerabotKayu("MJ001", "Meja Kantor", 10.0, 500000);
        PerabotKayu kursi = new PerabotKayu("KR01", "Kursi Kantor", 3.0, 250000);
        PerabotKayu lemari = new PerabotKayu("LM021", "Lemari Pakaian", 50.0, 1200000);
        PerabotKayu rakBuku = new PerabotKayu("RB031", "Rak Buku", 15.0, 750000);
        PerabotKayu tempatTidur = new PerabotKayu("TT043", "Spring Bed", 20.0, 3500000);

        Elektronik lampu = new Elektronik("LP134", "Lampu LED", 0.1, 100000);
        Elektronik kipas = new Elektronik("KA142", "Kipas Angin", 2.0, 250000);
        Elektronik tv = new Elektronik("TV151", "Smart TV 32 Inch", 3.0, 2100000);
        Elektronik radio = new Elektronik("RD164", "Radio FM", 2.0, 300000);

        AktivitasPencatatan<Furniture> pencatatan = new AktivitasPencatatan<>();
        pencatatan.tambahList(meja);
        pencatatan.tambahList(kursi);
        pencatatan.tambahList(lemari);
        pencatatan.tambahList(rakBuku);
        pencatatan.tambahList(tempatTidur);

        pencatatan.tambahList(lampu);
        pencatatan.tambahList(kipas);
        pencatatan.tambahList(tv);
        pencatatan.tambahList(radio);

        // mencetak masing-masing barang
//        for (var barang : pencatatan.listBarangTerjual){
//            System.out.println(barang);
//        }

        // mencetak rekapitulasi
        pencatatan.rekapitulasi();
    }
}
