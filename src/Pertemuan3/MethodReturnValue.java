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
public class MethodReturnValue {

    /**
     * @param args the command line arguments
     */
    
    public static int pangkatDua(int bil){
        return bil * bil;
    }
    
    public static float getDiskon(float persen, float harga){
        float diskon = harga * persen /100;
        return diskon;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int bil2 = pangkatDua(4);
        float diskon = getDiskon(2.5f, 5000f);
         System.out.println(bil2);
         System.out.println(diskon);
         
         MethodDasar.salam();
         MethodDasar.kaliDua(4, 5);
    }
    
}
