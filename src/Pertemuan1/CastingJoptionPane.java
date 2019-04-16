/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;

import javax.swing.JOptionPane;

/**
 *
 * @author pranadana
 */
public class CastingJoptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String a = JOptionPane.showInputDialog("Masukkan Nama : ");
        float b = Float.parseFloat(JOptionPane.showInputDialog("Masukkan lama kerja : "));
        JOptionPane.showMessageDialog(null, "Nama : "+a+" Lama kerja : "+(b*50000));
    }
    
}
