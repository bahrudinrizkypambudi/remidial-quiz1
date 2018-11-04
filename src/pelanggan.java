/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sintongs
 */
public class pelanggan {
    private String nama;
    private Kamera kamera;
    private int hari;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Kamera getKamera() {
        return kamera;
    }

    public void setKamera(Kamera kamera) {
        this.kamera = kamera;
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }
    
    public int hitungBaiayaTotal(){
        return kamera.hitungBiayaMobil;
    }
}
