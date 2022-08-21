
public class Layang extends BangunDatar implements Hitung {
    private double diagonal1;
    private double diagonal2;
    private double sisiMiring1;
    private double sisiMiring2;

    public Layang(String nama, double diagonal1, double diagonal2, double sisiMiring1, double sisiMiring2) {
        this.setNama(nama);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisiMiring1 = sisiMiring1;
        this.sisiMiring2 = sisiMiring2;
    }

    @Override
    public void info() {
        System.out.printf("====================================================\n" +
                        "Nama Bangun Datar\t\t: %s\n" +
                        "Panjang Diagonal 1\t\t: %.2f\n" +
                        "Panjang Diagonal 2\t\t: %.2f\n" +
                        "Panjang Sisi Miring 1\t: %.2f\n" +
                        "Panjang Sisi Miring 2\t: %.2f\n" +
                        "Luas\t\t\t\t\t: %.2f\n" +
                        "Keliling\t\t\t\t: %.2f\n" +
                        "Nilai Spesial\t\t\t: %.2f\n",
                        this.nama, diagonal1, diagonal2, sisiMiring1, sisiMiring2, this.hitungLuas(),
                        this.hitungKeliling(), this.hitungSpesial());
    }

    @Override
    public double hitungLuas() {
        return diagonal1 * diagonal2 * 0.5;
    }

    @Override
    public double hitungKeliling() {
        return (2 * sisiMiring1) + (2 * sisiMiring2);
    }

    @Override
    public double hitungSpesial() {
        double tinggi = 0;
        double alas = 0;

        if (diagonal1 < diagonal2)
            alas = diagonal1;
        else if (diagonal2 < diagonal1)
            alas = diagonal2;

        if (sisiMiring1 < sisiMiring2){
            tinggi = Math.sqrt((sisiMiring1 * sisiMiring1) - Math.pow((0.5 * alas), 2));
        } else if (sisiMiring2 < sisiMiring1){
            tinggi = Math.sqrt((sisiMiring2 * sisiMiring2) - Math.pow((0.5 * alas), 2));
        }

        return 0.5 * tinggi * alas;
    }

}
