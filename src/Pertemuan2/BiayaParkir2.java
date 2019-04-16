/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;

import java.util.Scanner;

/**
 *
 * @author pranadana
 */
public class BiayaParkir2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Jam Masuk : ");
        int masuk = input.nextInt();
        
        System.out.println("Jam Keluar : ");
        int keluar = input.nextInt();
        
        if(keluar < masuk ){
            keluar += 12; //keluar = keluar + 12
        }
        
        int total = keluar - masuk;
        int harga = 2000 + ((total-1)*1000);
        System.out.println("Biaya Parkir selama " + total + " jam adalah : " + harga);
    }
    
}