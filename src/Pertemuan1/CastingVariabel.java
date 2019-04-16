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
public class CastingVariabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a = 10;
        
        //dari int ke String
        String b = String.valueOf(a);
        
        //dari int ke double
        double c = (double) a;
        
        //dari String ke int
        int d = Integer.parseInt(b);
        
        
        int nilai1 = 12;
        String nilai2 = "50";
        int konversi = Integer.parseInt(nilai2);
        int hasil = nilai1 + konversi;
        System.out.println(hasil);
        
        double val1 = 10.7;
        int val2 = (int) val1;
        System.out.println(val2);
    }
    
}
