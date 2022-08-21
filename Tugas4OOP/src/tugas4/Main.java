package tugas4;

public class Main {
    public static void main(String[] args) {

        PegawaiPNS pegawaiPNS1 = new PegawaiPNS("Jl. Pasirbatu No.5", "Yusuf", "Sekertariat" );
        pegawaiPNS1.setUangMakan(1000000);
        pegawaiPNS1.setHonorLembur(150000);
        pegawaiPNS1.setGajiPokok(4500000);
        pegawaiPNS1.BuatLaporanKerja(12);

        PegawaiKontrak pegawaiKontrak1 = new PegawaiKontrak("Jl. Merpati Hitam", "Abas", "Sekertariat");
        pegawaiKontrak1.setHonorHarian(100000);

        PejabatDinas pejabatDinas1 = new PejabatDinas("Jl. Kerikilbatu No.1", "Banu", "Sekertariat");
        pejabatDinas1.setTunjanganJabatan(6000000);
        pejabatDinas1.BuatLaporanKerja(23);

        // Membuat class pegawai dan merubah menjadi PejabatDinas
        Pegawai pegawai1 = new Pegawai("Jl. Kerang Mulia", "Anas", "Sekertariat");
        pegawai1 = new PejabatDinas("Jl. Kerang Mulia", "Anas", "Sekertariat");

        pegawai1.BuatLaporanKerja(23);

    }
}

