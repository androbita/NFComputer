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
public class LatihanIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Selamat Datang di Bioskop");
        System.out.println("Masukkan umur anda : ");
        
        Scanner scanner = new Scanner(System.in);
        int umur = scanner.nextInt();
        
        if (umur > 13) {
            System.out.println("Anda harus membayar tiket masuk");
        }
        
        System.out.println("Silahkan masuk");
    }
    
}
