package praktikum4;

public class Pekerja extends Manusia{
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;

    public static int totalPekerja;


    Pekerja(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(nama, NIK, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;

        this.setGaji();
        this.setBonus();

        totalPekerja++;
    }

    public double getGaji() {
        return gaji;
    }

    public double getBonus() {
        return bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setGaji() {
        if (jamKerja <= 7){
            this.gaji = 10 * jamKerja * hariKerja;
        } else {
            this.gaji = 10 * 7 * hariKerja;
        }
    }

    public void setBonus() {
        if (this.hariKerja > 20) {
            int hariLibur = (hariKerja/7) * 2;


            double lemburLibur = (jamKerja - 7) * 35 * hariLibur;
            double lemburBiasa = (jamKerja - 7) * 15 * (hariKerja - hariLibur);
            double bonusLibur = (7 * 20) * (hariKerja - 20);

            if (this.jamKerja > 7){
                this.bonus = bonusLibur + lemburBiasa + lemburLibur;
            }else if (this.jamKerja <= 7){
                this.bonus = (jamKerja * 20) * hariLibur;
            }

        } else if (this.hariKerja <= 20){
            if (this.jamKerja > 7) {
                this.bonus = (jamKerja - 7) * 15 * hariKerja;
            } else {
                this.bonus = 0;
            }
        }
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getStatus(){
        String kantor = "", departemen = "";

        switch (this.NIP.charAt(0)){
            case '1' : kantor = "Mondstadt"; break;
            case '2' : kantor = "Liyue"; break;
            case '3' : kantor = "Inazuma"; break;
            case '4' : kantor = "Sumeru"; break;
            case '5' : kantor = "Fontaine"; break;
            case '6' : kantor = "Natlan"; break;
            case '7' : kantor = "Snezhnaya"; break;
            default  : kantor = "";
        }

        switch (this.NIP.charAt(6)){
            case '1' : departemen = "Pemasaran"; break;
            case '2' : departemen = "Humas"; break;
            case '3' : departemen = "Riset"; break;
            case '4' : departemen = "Teknologi"; break;
            case '5' : departemen = "Personalia"; break;
            case '6' : departemen = "Akademik"; break;
            case '7' : departemen = "Administrasi"; break;
            case '8' : departemen = "Operasi"; break;
            case '9' : departemen = "Pembangunan"; break;
            default  : departemen = "";
        }

        return String.format("%s, %s Cabang %c", departemen, kantor, this.NIP.charAt(2));
    }

    public String toString() {
        double pendapatan = this.getTunjangan() + this.getGaji() + this.getBonus();

        return String.format("Nama\t\t\t: %s\nNIK\t\t\t\t: %s\nJenis Kelamin\t: %s\nPendapatan\t\t: $%.1f\n" +
                        "Bonus\t\t\t: %s\nGaji\t\t\t: %.1f\nStatus\t\t\t: %s\n",
                this.getNama(), this.getNIK(), this.getJenisKelamin(), pendapatan, this.getBonus(),
                this.getGaji(), this.getStatus());
    }

    public static int total(){
        return totalPekerja;
    }

    public static void main(String[] args) {
        Pekerja pkj[] = new Pekerja[4];

        pkj[1] = new Pekerja(9,28,"541983639", "Zaenudin Aziz",
                                "33031678098000005", true, true);
        pkj[2] = new Pekerja(7,17,"745983337", "Dwi Dwiani",
                                "33031525019800003", false, true);
        pkj[3] = new Pekerja(10,20,"444983434", "James Dnob",
                                "33031121018800002", true, false);

        for (int i = 1; i < pkj.length; i++){
            System.out.println(pkj[i].toString());
        }

        System.out.println("Total Pekerja\t: " + Pekerja.total());
    }
}
