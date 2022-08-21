package tugasAkhir;

import java.util.ArrayList;

public class Donasi <T> {

    private T donasi;
    public Bantuan bantuan;
    public User user;

    public Donasi(Bantuan bantuan, T nominal, User user){
        this.donasi = nominal;
        this.bantuan = bantuan;
        this.user = user;
    }

    public Donasi(){}

    public T getDonasi() {
        return this.donasi;
    }

    static ArrayList<Donasi> listDonasi = new ArrayList<>();

    public void tambahDonasi(Bantuan bantuan, T donasi, User user){
        listDonasi.add(new Donasi(bantuan, donasi, user));
    }

    public void info(){
        for (int i = 0; i < listDonasi.size(); i++){
            System.out.println(listDonasi.get(i).getDonasi());
        }
    }
}
