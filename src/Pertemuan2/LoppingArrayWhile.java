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
public class LoppingArrayWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int total = 0, counter = 0;
        int angka[] = {4,5,7,8,9};
        
        while (counter < angka.length) {            
            total += angka[counter];
            System.out.println(angka[counter]);
            counter++;
        }
        
        float rata2 = (float) total/angka.length;
        System.out.println("Rata-Rata : "+rata2);
    }
    
}
