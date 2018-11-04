/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iloops
 */
public class Bank {
    public static void main(String a[]){
        nasabah Agus = new nasabah("Agus", 123456789);
        rekening bni = new rekening(123456789, 1000000);
        Agus.bukarekening(bni);
        System.out.println(Agus.toStr());
        
        tabungan bri = new tabungan(56789, 200000);
        Agus.bukarekening(bri);
        System.out.println(Agus.toStr());
        bri.transfer(34567, 100000);
        
        deposito mandiri = new deposito(456789, 10000000, 36);
        Agus.bukarekening(mandiri);
        System.out.println(Agus.toStr());
    }
}

