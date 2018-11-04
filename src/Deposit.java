/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iloops
 */
    class deposito extends rekening{
    int jangkawaktu;
    deposito(long n, double s, int j){
        super(n,s);     //constructor utk base class
        jangkawaktu = j;
        System.out.println("Deposito "+getnomor()+" senilai "+saldo+" dibuat dengan jangka "+jangkawaktu+" bulan");
    }
}

