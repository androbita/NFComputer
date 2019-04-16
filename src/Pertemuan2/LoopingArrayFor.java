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
public class LoopingArrayFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int angka[] = {4, 5, 7, 8, 9};
        float c = 0;
        
        for(int b = 0; b < angka.length; b++){
            c = c + angka[b];
            //ketika looping ke 0, c = 0, didapat angka 4, c + 4
            //ketika looping ke 1, c = 4, didapat angka 5, c + 5
            //ketika looping ke 2, c = 9, didapat angka 7, c + 7
            //ketika looping ke 3, c = 16, didapat angka 8, c + 8
            //ketika looping ke 4, c = 24, didapat angka 9, c + 9
            //hasil akhir c = 33
            System.out.println(c);
        }
        System.out.println("Rata-rata : " + (c / angka.length));
    }
}
