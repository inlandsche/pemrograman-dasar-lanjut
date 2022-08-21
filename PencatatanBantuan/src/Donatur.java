public class Donatur {
    private String nama;
    private Bantuan bantuan;
    private Bantuan<String> bantuanLain;
    private Bantuan<Double> bantuanUang;

    public Donatur(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void berdonasi(String bantuan){
        this.bantuanLain.tambah(bantuan);
    }

    public void berdonasi(Double bantuan){
        this.bantuanUang.tambah(bantuan);
    }

    public void setBantuanLain(Bantuan<String> bantuanLain) {
        this.bantuanLain = bantuanLain;
        bantuanLain.setDonatur(this);
    }

    public void setBantuan(Bantuan bantuan) {
        this.bantuan = bantuan;
    }

    public void setBantuanUang(Bantuan<Double> bantuanUang) {
        this.bantuanUang = bantuanUang;
        bantuanUang.setDonatur(this);
    }
}
