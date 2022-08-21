package praktikum6;

public class Pegawai {
    private String nama;
    private String noKTP;

    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public double gaji() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Nama\t\t\t: %s\n" +
                             "No. KTP\t\t: %s\n",
                             this.getNama(), this.getNoKTP());
    }
}
