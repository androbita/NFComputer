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
public class NilaiDiklat {

    public double pretest;
    public double postest;
    public double kehadiran;

    public NilaiDiklat(double pretest, double postest, double kehadiran) {
        this.pretest = pretest;
        this.postest = postest;
        this.kehadiran = kehadiran;
    }
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Diklat peserta1 = new Diklat(1, "Ujang", 2019, 5, 5000000);
        peserta1.cetak();
        NilaiDiklat nilai1 = new NilaiDiklat(50, 60, 70);
        nilai1.getHasil();
        
        
        Diklat peserta2 = new Diklat(2, "Budi", 2019, 3, 5000000);
        peserta2.cetak();
        NilaiDiklat nilai2 = new NilaiDiklat(80, 90, 50);
        nilai2.getHasil();
        
        Diklat peserta3 = peserta2;
        peserta3.cetak();
        NilaiDiklat nilai3 = new NilaiDiklat(50, 60, 30);
        nilai3.getHasil();
    }
    
    public double getHasil(){
        double nilai = (0.2 * this.pretest) + (0.6 * this.postest) + (0.2 * this.kehadiran);
        
        if (nilai > 65) {
            System.out.println("Lulus");
        }
        else{
            System.out.println("Tidak Lulus");
        }
        return nilai;
    }
}
