/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;

/**
 *
 * @author pranadana
 */
public class OperatorVariabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nilai1 = 50;
        int nilai2 = 10;
        
        //addition cara 1
        int hasil = nilai1 + nilai2;
        System.out.println("Hasilnya adalah : "+hasil);
        
        //additional cara 2
        //penjumlahan
        System.out.println("Hasil Penjumlahan " +nilai1+" dan "
                + nilai2 +" adalah : "+(nilai1 + nilai2));
        //pengurangan
        System.out.println("Hasil Pengurangan " +nilai1+" dan "
                + nilai2 +" adalah : "+(nilai1 - nilai2));
        //perkalian
        System.out.println("Hasil Perkalian " +nilai1+" dan "
                + nilai2 +" adalah : "+(nilai1 * nilai2));
        //pembagian
        System.out.println("Hasil Pembagian " +nilai1+" dan "
                + nilai2 +" adalah : "+(nilai1 / nilai2));
        //modulus
        System.out.println("Hasil Modulus " +nilai1+" dan "
                + nilai2 +" adalah : "+(nilai1 % nilai2));
        
//        nilai1 = nilai2;
        
        nilai1 += nilai2;
//        nilai1 = nilai1 + nilai2;
//        nilai1 = 50 + 10;
//        nilai1 = 60;
        
        nilai1 -= nilai2;
//        nilai1 = nilai1 - nilai2;
//        nilai1 = 60-10;
//        nilai1 = 50;

        String nama_depan = "Budi";
        String nama_belakang = " Santoso";
        nama_depan += nama_belakang;
        System.out.println(nama_depan);
    }
    
}
