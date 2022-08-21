/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classData;

/**
 *
 * @author Qolandar
 */
public class Civitas {
    private String nama;
    private String prodi;
    private String fakultas;

    public Civitas(String nama, String prodi, String fakultas) {
        this.nama = nama;
        this.prodi = prodi;
        this.fakultas = fakultas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
}
