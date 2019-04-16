/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author pranadana
 */
public class MethodDasar {

    /**
     * @param args the command line arguments
     */
    
    // buat method tanpa parameter
     public static void salam(){
        System.out.println("Selamat Datang");
    }
    
     // buat method dengan 2 buah parameter
    public static void kaliDua(int bil1, int bil2){
        // bil1 = 3
        // bil2 = 5
        int hasil = bil1 * bil2;
        System.out.println(bil1 + " dikali " + bil2 + " = "+ hasil);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
//        panggil method salam()
        salam();
        
//        panggil method kaliDua(dengan 2 buah parameter)
        kaliDua(3, 5);
    }
}
