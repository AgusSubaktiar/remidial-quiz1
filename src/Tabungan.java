/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iloops
 */
    class tabungan extends rekening{
    tabungan(long n, double s){
        super(n,s);    
    }
    public void transfer(long tujuan, double nominal){
        if (getsaldo() > nominal){
            double saldo = 0;
            setsaldo(saldo - nominal);
            System.out.println("Transfer sukses.\nSaldo "+getsaldo());
        }
        else{
            System.out.println("Transfer gagal. Saldo tidak cukup");
        }
    }
}

