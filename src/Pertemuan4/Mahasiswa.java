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
public class Mahasiswa {
    public String nim;
    public String nama;
    public float ipk;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim; //01103
        this.nama = nama; // budi
    }
    
    
    
    public String predikat(){
        
        if (this.ipk > 3.7f) {
            return "CumLaude";
        }else{
            return "Welldone";
        }
    }
}
