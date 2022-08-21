abstract class Tanaman {
    private int masaHidup;
    private int lamaHidup;
    private int berbuah;
    private int buah;

    private double perkembangan;
    private double prosesBerbuah;

    public abstract void berkembang();

    public String status(){
        if (lamaHidup >= masaHidup){
            return "Mati";
        } else return "Hidup";
    }

    @Override
    public String toString() {
        return String.format("Masa Hidup\t\t: %d hari\n" +
                             "Umur Tanaman\t: %d hari\n" +
                             "Menghasilkan\t: %d buah %s\n" +
                             "Status\t\t\t: %s\n",
                              masaHidup, lamaHidup, buah, getClass().getSimpleName(), status());
    }

    public int getMasaHidup() {
        return masaHidup;
    }

    public void setMasaHidup(int masaHidup) {
        this.masaHidup = masaHidup;
    }

    public int getLamaHidup() {
        return lamaHidup;
    }

    public void setLamaHidup(int lamaHidup) {
        this.lamaHidup = lamaHidup;
    }

    public int getBerbuah() {
        return berbuah;
    }

    public void setBerbuah(int berbuah) {
        this.berbuah = berbuah;
    }

    public int getBuah() {
        return buah;
    }

    public void setBuah(int buah) {
        this.buah = buah;
    }

    public double getPerkembangan() {
        return perkembangan;
    }

    public void setPerkembangan(double perkembangan) {
        this.perkembangan = perkembangan;
    }

    public double getProsesBerbuah() {
        return prosesBerbuah;
    }

    public void setProsesBerbuah(double prosesBerbuah) {
        this.prosesBerbuah = prosesBerbuah;
    }
}
