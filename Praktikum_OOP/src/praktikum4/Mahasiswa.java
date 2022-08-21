package praktikum4;

public class Mahasiswa extends Manusia{
    private String NIM;
    private double IPK;

    public static int totalMahasiswa;

    Mahasiswa(String NIM, double IPK, String nama, String NIK, boolean jenisKelamin, boolean menikah){
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
        totalMahasiswa++;
    }

    public String getNIM() {
        return NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getStatus(){
        String angkatan = "20" + this.NIM.substring(0,2);

        if (NIM.charAt(6) == '2'){
            return "Teknik Meniup Gelembung, " + angkatan;
        } else if (NIM.charAt(6) == '3'){
            return "Teknik Berburu Ubur Ubur, " + angkatan;
        } else if (NIM.charAt(6) == '4'){
            return "Sistem Perhamburgeran, " + angkatan;
        } else if (NIM.charAt(6) == '6'){
            return "Pendidikan Chum Bucket, " + angkatan;
        } else if (NIM.charAt(6) == '7'){
            return "Teknologi Telepon Kerang, " + angkatan;
        } else {
            return "Prodi tidak ditemukan";
        }
    }

    public double getBeasiswa(){
        if (this.IPK >= 3.0 && this.IPK < 3.5){
            return 50;
        } else if (this.IPK >= 3.5 && this.IPK <= 4.0){
            return 75;
        } else {
            return 0;
        }
    }

    public String toString() {
        double pendapatan = this.getTunjangan() + this.getBeasiswa();

        return String.format("Nama\t\t\t: %s\nNIK\t\t\t\t: %s\nJenis Kelamin\t: %s\nPendapatan\t\t: $%.1f\n" +
                "NIM\t\t\t\t: %s\nIPK\t\t\t\t: %.1f\nStatus\t\t\t: %s\n",
                this.getNama(), this.getNIK(), this.getJenisKelamin(), pendapatan, this.getNIM(),
                this.getIPK(), this.getStatus());
    }

    public static int total(){
        return totalMahasiswa;
    }

    public static void main(String[] args) {
        Mahasiswa mhs[] = new Mahasiswa[4];

        mhs[1] = new Mahasiswa("225150201111000", 3.7, "Raffles Thomas",
                "3302151606320009", true, false);
        mhs[2] = new Mahasiswa("215150400111023", 3.0, "Camelia Untani",
                "3302151708970003", false, false);
        mhs[3] = new Mahasiswa("185150607111010", 2.9, "Felix Kucani",
                "3302152001980004", true, true);

        for (int i = 1; i < mhs.length; i++){
            System.out.println(mhs[i].toString());
        }

        System.out.println("Total Mahasiswa\t: " + Mahasiswa.total());
    }
}
