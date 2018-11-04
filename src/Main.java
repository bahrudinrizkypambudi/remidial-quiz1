/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bahrudin<bahrudinrizky313@gmai.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pelanggan udin=new Pelanggan("Udin", 3);
        Kamera kam=new Kamera("Cannon", 50000);
        
        Transaksi t= new Transaksi(kam, udin);
        t.print();
        
    }
    
}
