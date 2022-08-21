package praktikum4;

public class Manager extends Pekerja {
    private int lamaKerja;
    public static int totalManager;


    Manager(int lamaKerja, int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean menikah, boolean jenisKelamin) {
        super(jamKerja, hariKerja, NIP, nama, NIK, jenisKelamin, menikah);
        this.setLamaKerja(lamaKerja);
        totalManager++;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    @Override
    public double getBonus() {
        return super.getBonus() * 1.35;
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + 15;
    }

    public String toString() {
        double pendapatan = this.getTunjangan() + this.getGaji() + this.getBonus();

        return String.format("Nama\t\t\t: %s\nNIK\t\t\t\t: %s\nJenis Kelamin\t: %s\nPendapatan\t\t: $%.1f\n" +
                        "Bonus\t\t\t: %s\nGaji\t\t\t: %.1f\nStatus\t\t\t: %s\nLama Kerja\t\t: %d tahun\n",
                this.getNama(), this.getNIK(), this.getJenisKelamin(), pendapatan, this.getBonus(),
                this.getGaji(), this.getStatus(), this.getLamaKerja());
    }

    public static int total(){
        return totalManager;
    }

    public static void main(String[] args) {
        Manager mgr[] = new Manager[4];

        mgr[1] = new Manager(10, 7,20, "342598489", "Jirawati",
                                    "3205441212910001", false, false);
        mgr[2] = new Manager(8, 6,30, "744598589", "Jalaludin",
                                    "3405441111910001", false, true);
        mgr[3] = new Manager(13, 7,21, "846593889", "Wiryawan",
                                    "3105441803910001", true, true);

        for (int i = 1; i < mgr.length; i++){
            System.out.println(mgr[i].toString());
        }

        System.out.println("Total Manager\t: " + Manager.total());
    }
}
