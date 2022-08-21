package tugas01;

class listPS{

    String jenis;
    String nomor;
    Boolean tersedia;

    void getJenisPS(){
        System.out.println("Jenis\t\t: " + this.jenis);
    }

    void getNomorPS(){
        System.out.println("Nomor TV\t: " + this.nomor);
    }

    void getKetersediaan(){

        if (this.tersedia == true)
            System.out.println("Tersedia\t: Ya, masih kosong");
        else
            System.out.println("Tersedia\t: Tidak, sudah ada yang main ");

        System.out.println();
    }

    public static void main(String[] args) {

        // object
        listPS ps01 = new listPS();
        ps01.jenis = "PS 3";
        ps01.nomor = "01";
        ps01.tersedia = true;

        listPS ps02 = new listPS();
        ps02.jenis = "PS 3";
        ps02.nomor = "02";
        ps02.tersedia = false;

        listPS ps03 = new listPS();
        ps03.jenis = "PS 4";
        ps03.nomor = "03";
        ps03.tersedia = true;

        // memanggil isi data
        ps01.getJenisPS();
        ps01.getNomorPS();
        ps01.getKetersediaan();

        ps02.getJenisPS();
        ps02.getNomorPS();
        ps02.getKetersediaan();

        ps03.getJenisPS();
        ps03.getNomorPS();
        ps03.getKetersediaan();
    }
}
