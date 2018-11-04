package Bahrudin.RemidialQuiz;

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
    
        public int hitungBaiayaTotal(){
        return this.kamera.hitungBiayakamera(this.pelanggan.getHari());
    }
    
    public void print(){
        System.out.println(" ------------RENTAL KAMERA----------------");
        System.out.println(" |Nama        : "+this.pelanggan.getNama());
        System.out.println(" |Jumlah hari : "+this.pelanggan.getHari());
        System.out.println(" |Merk        : "+this.kamera.getMerk());
        System.out.println(" |Biaya       : "+this.kamera.getBiaya());
        System.out.println(" |Biaya Total : "+this.hitungBaiayaTotal());
    }
    
}
