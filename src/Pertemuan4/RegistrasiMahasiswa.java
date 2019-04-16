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
public class RegistrasiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mahasiswa mhs1 = new Mahasiswa("01102", "Ujang");
        mhs1.ipk = 3.87f;
        
//        mhs1.nim = "01102";
//        mhs1.nama = "Ujang";
//        mhs1.ipk = 3.87f;
        
        Mahasiswa mhs2 = new Mahasiswa("01103", "Budi");
        mhs2.ipk = 3.4f;
//        mhs2.nim = "01103";
//        mhs2.nama = "Budi";
//        mhs2.ipk = 3.4f;

        Mahasiswa mhs3 = mhs2;
        mhs3.ipk = 3.6f;
        
        System.out.println("Nama : " + mhs1.nama + ", IPK : " + mhs1.ipk);
        System.out.println("Predikat : " + mhs1.predikat());
        System.out.println("Nama : " + mhs2.nama + ", IPK : " + mhs2.ipk);
        System.out.println("Predikat : " + mhs2.predikat());
        System.out.println("Nama : " + mhs3.nama + ", IPK : " + mhs3.ipk);
        System.out.println("Predikat : " + mhs3.predikat());
    }
}
