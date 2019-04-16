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
public class PanggilPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pegawai pegawai1 = new Pegawai();
        pegawai1.setId("1");
        pegawai1.setNama("Ujang");
        pegawai1.setGaji(5000000);
        
        System.out.println(pegawai1.getId());
        System.out.println(pegawai1.getNama());
        System.out.println(pegawai1.getGaji());
    }
}
