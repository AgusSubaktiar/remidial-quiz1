/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iloops
 */
class nasabah {
    //data
    String nama;
    long ktp;
    rekening rek;

    //method
    public nasabah(){
        nama = "kosong"; ktp = 0;
        System.out.println("nasabah baru dibuat...");
    }
    public nasabah(String n, long k){
        nama = n; ktp = k;
        System.out.println("nasabah "+nama+" dibuat...");
    }
    public nasabah(String n){ nama = n; }
    public nasabah(long k){ ktp = k; }
    //2. setter --> mengisi/ mengubah data
    void setNama(String n){
        nama = n;
    }
    void setKtp(long k){
        ktp = k;
    }
    //3. getter --> mengambil data
    String getNama(){
        return nama;
    }
    long getKtp(){
        return ktp;
    }
    //4. query
    String toStr(){
        return "nasabah "+nama+ " no. rekeningnya " +rek.getnomor();
    }
    public void bukarekening(rekening r){
        rek = r;    //object assignment
        System.out.println(nama+" sukses buka rekening "+rek.toStr());
    }
}
