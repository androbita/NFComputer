/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;

/**
 *
 * @author pranadana
 */
public class LoopingArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String hari[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        
        int panjangArray = hari.length;
        
        for(int i = 0; i < panjangArray; i++){
            System.out.println("Hari ke-"+(i+1)+" adalah : "+hari[i]);
        }
    }
    
}
