/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4;

/**
 *
 * @author pranadana
 */
public class Diklat {
    public int id;
    public String nama;
    public int tahun;
    public int angkatan;
    public double budget;

    public Diklat(int id, String nama, int tahun, int angkatan, double budget) {
        this.id = id;
        this.nama = nama;
        this.tahun = tahun;
        this.angkatan = angkatan;
        this.budget = budget;
    }
    
    public void cetak(){
        System.out.println("ID : " + this.id + ", Nama : " + this.nama + ", Tahun : " + this.tahun + ", angkatan : "
                + this.angkatan + ", budget : " + this.budget);
    }
}
