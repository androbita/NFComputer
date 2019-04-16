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
public class LoopingInputUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int total = 0;
        
        System.out.println("Masukkan jumlah inputan : ");
        int a = input.nextInt();
        
        for(int i = 1; i <= a; i++){
            System.out.println("Masukkan angka ke-"+i+" : ");
            total += input.nextInt();
        }
        System.out.println("hasil : "+total);
        System.out.println("Rata-rata : "+total/a);
    }
}
