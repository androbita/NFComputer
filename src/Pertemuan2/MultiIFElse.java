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
public class MultiIFElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nama Siswa : ");
        String nama = input.nextLine();
        
        System.out.println("Masukkan nilai siswa : ");
        int nilai = input.nextInt();
        
        String keterangan = "";
        
        if (nilai > 55) {
            keterangan = "Lulus";
        }else if (nilai <= 55) {
            keterangan = "Tidak lulus";
        }
        
        char grade;
        
        if (nilai >=0 && nilai <= 30) {
            grade = 'E';
            System.out.println("Siswa "+ nama + " Nilai " + nilai
                + " dinyatakan "+keterangan+" dengan Grade " + grade);
        }else if(nilai > 30 && nilai <= 55){
            grade = 'D';
            System.out.println("Siswa "+ nama + " Nilai " + nilai
                + " dinyatakan "+keterangan+" dengan Grade " + grade);
        }else if (nilai > 55 && nilai < 70) {
            grade = 'C';
            System.out.println("Siswa "+ nama + " Nilai " + nilai
                + " dinyatakan "+keterangan+" dengan Grade " + grade);
        }else if (nilai >= 70 && nilai < 85) {
            grade = 'B';
            System.out.println("Siswa "+ nama + " Nilai " + nilai
                + " dinyatakan "+keterangan+" dengan Grade " + grade);
        }else if(nilai >= 85 && nilai <= 100){
            grade = 'A';
            System.out.println("Siswa "+ nama + " Nilai " + nilai
                + " dinyatakan "+keterangan+" dengan Grade " + grade);
        }else{
            System.out.println("Angka yang dimasukkan salah");
        }
    } 
}
