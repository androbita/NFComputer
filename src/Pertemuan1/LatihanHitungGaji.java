/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;

import java.util.Scanner;

/**
 *
 * @author pranadana
 */
public class LatihanHitungGaji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan nama : ");
        String nama = scanner.nextLine();
        
        System.out.println("Masukkan Lama Kerja : ");
        float jam = scanner.nextFloat();
        
        float gaji = jam * 50000;
        
        System.out.println("Gaji Pegawai " + nama + " selama "+jam+" adalah "+ gaji);
    }
    
}
