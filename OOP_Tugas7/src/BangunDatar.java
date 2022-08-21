abstract class BangunDatar {
    public String nama;
    static String[] listBangunDatar = new String[10];

    public static BangunDatar getInstanceBangunDatarOf(Hitung bangun){
        BangunDatar bangunDatar = null;
        if(bangun instanceof Persegi)
            bangunDatar = (Persegi)bangun;
        else if(bangun instanceof Segitiga)
            bangunDatar = (Segitiga) bangun;
        else if(bangun instanceof Lingkaran)
            bangunDatar = (Lingkaran) bangun;
        else if(bangun instanceof Trapesium)
            bangunDatar = (Trapesium) bangun;
        else if(bangun instanceof Layang)
            bangunDatar = (Layang)bangun;
        return bangunDatar;
    }


    public abstract void info();

    public void search(String namaBangun) {
        System.out.println("===================================================");
        System.out.println("Hasil pencarian bangun datar :");

        int total = 0;

        for (int i = 0; i < listBangunDatar.length; i++){
            if (namaBangun.equalsIgnoreCase(listBangunDatar[i])){
                total++;
            }
        }

        if (total == 0){
            System.out.printf("Bangun datar %s tidak ada dalam list bangun datar\n", namaBangun);
        } else {
            System.out.printf("Bangun datar %s ditemukan!!\n", namaBangun);
            System.out.printf("Jumlah %s dalam list = %d\n", namaBangun, total);

            if (namaBangun.equalsIgnoreCase("Layang")){
                System.out.println("Sisi Bangun Datar\t: 4");
                System.out.println("Sudut Bangun Datar\t: 4");
            } else if (namaBangun.equalsIgnoreCase("Lingkaran")){
                System.out.println("Sisi Bangun Datar\t: 1");
                System.out.println("Sudut Bangun Datar\t: 0");
            } else if (namaBangun.equalsIgnoreCase("Persegi")){
                System.out.println("Sisi Bangun Datar\t: 4");
                System.out.println("Sudut Bangun Datar\t: 4");
            } else if (namaBangun.equalsIgnoreCase("Segitiga")){
                System.out.println("Sisi Bangun Datar\t: 3");
                System.out.println("Sudut Bangun Datar\t: 3");
            } else if (namaBangun.equalsIgnoreCase("Trapesium")){
                System.out.println("Sisi Bangun Datar\t: 4");
                System.out.println("Sudut Bangun Datar\t: 4");
            }
        }

    }


    public void setNama(String nama) {
        this.nama = nama;

        for (int i = 0; i < listBangunDatar.length; i++){
            if (listBangunDatar[i] == null){
                listBangunDatar[i] = nama;
                break;
            }
        }
    }
}
