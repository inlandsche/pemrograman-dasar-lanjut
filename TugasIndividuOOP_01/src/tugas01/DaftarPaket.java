package tugas01;

class DaftarPaket{

    String namaPaket;
    int harga;
    int durasi;

    void getNamaPaket(){
        System.out.println("Nama Paket\t\t: " + this.namaPaket);
    }

    void getHargaPaket(){
        System.out.println("Harga Paket\t\t: Rp" + this.harga);
    }

    void getDurasiPaket(){
        System.out.println("Durasi Paket\t: " + this.durasi +" jam");
        System.out.println();
    }

    public static void main(String[] args) {

        // object
        DaftarPaket paket1 = new DaftarPaket();
        paket1.namaPaket = "Paket Sejam";
        paket1.harga = 3000;
        paket1.durasi = 1;

        DaftarPaket paket2 = new DaftarPaket();
        paket2.namaPaket = "Paket Hemat Dua Jam";
        paket2.harga = 5000;
        paket2.durasi = 2;

        DaftarPaket paket3 = new DaftarPaket();
        paket3.namaPaket = "Paket Malam";
        paket3.harga = 10000;
        paket3.durasi = 6;

        DaftarPaket paket4 = new DaftarPaket();
        paket4.namaPaket = "Paket No Life";
        paket4.harga = 30000;
        paket4.durasi = 24;

        // memanggil isi data
        paket1.getNamaPaket();
        paket1.getHargaPaket();
        paket1.getDurasiPaket();

        paket2.getNamaPaket();
        paket2.getHargaPaket();
        paket2.getDurasiPaket();

        paket3.getNamaPaket();
        paket3.getHargaPaket();
        paket3.getDurasiPaket();

        paket4.getNamaPaket();
        paket4.getHargaPaket();
        paket4.getDurasiPaket();
    }
}
