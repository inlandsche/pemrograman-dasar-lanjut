package praktikum4;

public class Manusia {
    private String nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean menikah;

    public static int total;

    Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah){
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
        total++;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getJenisKelamin() {
        return jenisKelamin ? "Laki-laki" : "Perempuan";
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public double getTunjangan(){

        if (this.jenisKelamin == true && this.menikah == true){
            return 25;
        }
        else if (this.jenisKelamin == false && this.menikah == true){
            return 20;
        }
        else {
            return 15;
        }

    }

    @Override
    public String toString() {
        return String.format("Nama\t\t\t\t: %s\nNIK\t\t\t\t\t: %s\nJenis Kelamin\t\t: %s\nJumlah Pendapatan\t: $%.1f\n",
                this.getNama(), this.getNIK(), this.getJenisKelamin(), this.getTunjangan());
    }

    public static int total(){
        return total;
    }

    public static void main(String[] args) {
        Manusia manusia[] = new Manusia[4];

        manusia[1] = new Manusia("Abdul Jalaludin", "3302151309990001", true, false);
        manusia[2] = new Manusia("Citra Sari", "3302161708980003", false, true);
        manusia[3] = new Manusia("James Brown", "3302220708900006", true, true);

        for (int i = 1; i < manusia.length; i++){
            System.out.println(manusia[i].toString());
        }


        System.out.println("Total\t\t\t\t: " + Manusia.total());
    }
}