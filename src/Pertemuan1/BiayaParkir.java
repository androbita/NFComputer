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
public class BiayaParkir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nomor Kendaraan : ");
        String nopol = scanner.nextLine();
        
        System.out.println("Jam Masuk : ");
        float masuk = scanner.nextFloat();
        
        System.out.println("Jam Keluar : ");
        float keluar = scanner.nextFloat();
        
        float bayar = 2000 + ((keluar - masuk - 1)*1000);
        
        System.out.println(bayar);
    }
    
}
