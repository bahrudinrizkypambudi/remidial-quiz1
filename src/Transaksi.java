/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sintongs
 */
public class Transaksi {
    private Kamera kamera;
    private Pelanggan pelanggan;

    public Transaksi(Kamera kamera, Pelanggan pelanggan) {
        this.kamera = kamera;
        this.pelanggan = pelanggan;
    }

    public Kamera getKamera() {
        return kamera;
    }

    public void setKamera(Kamera kamera) {
        this.kamera = kamera;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }
    
    public void print(){
        
    }
}
