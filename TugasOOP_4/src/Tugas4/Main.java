package Tugas4;

public class Main {
    public static void main(String[] args) {

        PegawaiPNS pegawaiPNS1 = new PegawaiPNS("Jl. Pasirbatu No.5", "Yusuf", "PT. Sejagad" );
        pegawaiPNS1.setUangMakan(100000);
        pegawaiPNS1.setHonorLembur(150000);
        pegawaiPNS1.setGajiPokok(4500000);
        pegawaiPNS1.BuatLaporanKerja();

        PegawaiKontrak pegawaiKontrak1 = new PegawaiKontrak("Jl. Merpati Hitam", "Abas", "PT. Sejagad");
        pegawaiKontrak1.setHonorHarian(100000);

        PejabatDinas pejabatDinas1 = new PejabatDinas("Jl. Kerikilbatu No.1", "Banu", "PT. Sejagad");
        pejabatDinas1.setTunjanganJabatan(6000000);
        pejabatDinas1.BuatLaporanKerja();

        Pegawai pegawai1 = new Pegawai("Jl. Kerang Mulia", "Anas", "PT. Sejagad");
        pegawai1 = new PejabatDinas("Jl. Kerang Mulia", "Anas", "PT. Sejagad");



    }
}
