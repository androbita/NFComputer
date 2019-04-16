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
public class MethodOverloading {

    /**
     * @param args the command line arguments
     */
    
    public static float jumlah(int a, int b){
        float hasil = (float) a + (float) b;
        return hasil;
    }
    
    public static float jumlah(float a, float b){
        return a + b;
    }
    
    public static float jumlah(String a, String b){
        float x = Float.parseFloat(a);
        float y = Float.parseFloat(b);
        return x + y;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(jumlah(3.5f, 4.6f));
        System.out.println(jumlah("9", "6"));
        System.out.println(jumlah(8, 6));
    }
}
