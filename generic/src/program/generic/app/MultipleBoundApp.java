package program.generic.app;

public class MultipleBoundApp {
    public static void main(String[] args) {

        // ketika class Data hanya melakukan extends Pegawai, tidak ada error
        // Data<AtasanLangsung> atasan = new Data<>(new AtasanLangsung());
        Data<Direktur> direktur = new Data<>(new Direktur());

        // setelah menambahkan interface Salam pada parameter class Data
        // terjadi error pada Data dengan type AtasanLangsung
        // karena class AtasanLangsung hanya meng extends Pegawai, tetapi tidak melakukan
        // implements interface Salam sehingga tidak memenuhi syarat
    }

    public static interface Salam{
        void ucapSalam(String nama);
    }

    public static abstract class Pegawai{

    }

    public static class AtasanLangsung extends Pegawai{

    }

    public static class Direktur extends Pegawai implements Salam{
        @Override
        public void ucapSalam(String nama) {
            System.out.println("hai, " + nama);
        }
    }

    public static class Data<T extends Pegawai & Salam>{
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
