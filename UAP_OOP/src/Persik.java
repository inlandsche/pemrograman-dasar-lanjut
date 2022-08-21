public class Persik extends Tanaman implements Perawatan{

    public Persik() {
        this.setMasaHidup(180);
        this.setBerbuah(250);
        this.setPerkembangan(0.15);
    }

    @Override
    public void berkembang() {

        this.setProsesBerbuah(getProsesBerbuah() + (getBerbuah() * getPerkembangan()));

        if (getProsesBerbuah() == getBerbuah()) {
            this.setBuah(getBuah() + 1);
            this.setProsesBerbuah(0);
        }
        else if (this.getProsesBerbuah() > this.getBerbuah()){
            this.setBuah(getBuah() + 1);
            this.setProsesBerbuah(getProsesBerbuah() - getBerbuah());
        }


        this.setLamaHidup(getLamaHidup() + 1);

    }

    @Override
    public void treatment() {
        this.setPerkembangan(this.getPerkembangan() + 0.025);
    }
}
