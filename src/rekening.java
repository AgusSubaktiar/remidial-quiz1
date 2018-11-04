/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iloops
 */
class rekening {

    long nomor;
    double saldo;
    public rekening(long n, double s){
        nomor = n; saldo = s;
        System.out.println("Rekening nomor "+nomor+" sukses dibuat...");
    }
    public long getnomor(){ return nomor; }
    public double getsaldo(){ return saldo; }
    public void setsaldo(double s){ saldo = s; }
    public String toStr(){ return nomor+" saldonya: "+saldo; }
    public void transfer(long t){
        saldo = saldo - 100000;
        System.out.println("Sukses transfer 100.000 ke "+t);
        System.out.println("Sisa saldo : "+saldo);
    }
    public void bayarlistrik(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pembayaran Listrik\nMasukkan Kode Pelanggan = ");
        long kode = sc.nextLong();
        System.out.print("Masukkan jumlah = ");
        double tagihan = sc.nextDouble();
        if (saldo > tagihan)
        {   saldo = saldo - tagihan;
            System.out.println("Pembayaran tagihan sukses");
        }
        else System.out.println("Saldo tidak mencukupi");
        System.out.println("Saldo anda : "+saldo);
    }
    public void bayarlistrik(long k, double t){
        if (saldo > t)
        {   saldo = saldo - t;
            System.out.println("Pembayaran tagihan sukses");
        }
        else System.out.println("Saldo tidak mencukupi");
        System.out.println("Saldo anda : "+saldo);
    }
}
    