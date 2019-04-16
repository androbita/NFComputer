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
public class toStringPanggilPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        toStringPegawai peg1 = new toStringPegawai("011", "Ocha");
        toStringPegawai peg2 = new toStringPegawai("012", "Ocha");
        toStringPegawai peg3 = new toStringPegawai("012", "budi");
        
        if (peg1.equals(peg2)) {
            System.out.println(peg1 + " sama dengan " + peg2);
        }else{
            System.out.println(peg1 + " tidak sama dengan " + peg3);
        }
    }
    
}
