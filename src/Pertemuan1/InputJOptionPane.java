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
public class InputJOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nama = JOptionPane.showInputDialog("Masukkan Nama : ");
        JOptionPane.showMessageDialog(null, "Nama Anda adalah : "+nama);
    }
    
}
