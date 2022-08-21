public class CreateObject {
    public static void main(String[] args) {
        BangunDatar[] bangunDatar = new BangunDatar[3];

        bangunDatar[0] = new Lingkaran("Lingkaran", 20);
        bangunDatar[1] = new Persegi("Persegi", 12);
        bangunDatar[2] = new Segitiga("Segitiga", 5, 8);

        for (var bangun : bangunDatar ){
            bangun.info();
        }
    }
}
