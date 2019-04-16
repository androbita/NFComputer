/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4;

/**
 *
 * @author pranadana
 */
public class ContohException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        try {
//            int a = 9/3;
//            System.out.println(a);
//            
//            int[] b = new int[2];
//            b[5] = 10;
//        } catch (ArithmeticException e) {
//            System.out.println("9 tidak bisa dibagi dengan 0");
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Array melewati batas indeks");
//        }
        hitung(9);

    }
    
    public static int hitung(int a){
        try {
            int b = a / 0;
        } catch (Exception e) {
            System.out.println(e);
        }
        return a;
    }
}
