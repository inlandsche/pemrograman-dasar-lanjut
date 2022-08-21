public class Soal2 {
    public static void main(String[] args) {
        Hitung[] hitungs = new Hitung[5];
        hitungs[0] = new Persegi("Persegi",10);
        hitungs[1] = new Segitiga("Segitiga",5,10);
        hitungs[2] = new Layang("Layang", 6, 10, 4, 7);
        hitungs[3] = new Trapesium("Trapesium",8,10,4);
        hitungs[4] = new Lingkaran("Lingkaran",15);

        for(Hitung bangun : hitungs){
            BangunDatar bangunDatar = BangunDatar.getInstanceBangunDatarOf(bangun);
            bangunDatar.info();
        }

    }
}
