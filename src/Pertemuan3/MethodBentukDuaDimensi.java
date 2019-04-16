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
public class MethodBentukDuaDimensi {
    
    public static float luasLingkaran(float jari){
        float luasLingkaran = 3.14f * jari * jari;
        return luasLingkaran;
    }
    
    public static float kelilingLingkaran(float jari){
        float keliling = 2 * 3.14f * jari;
        return keliling;
    }
    
    public static float luasPersegiPanjang(float panjang, float lebar){
        float luasPersegiPanjang = panjang * lebar;
        return luasPersegiPanjang;
    }
    
    public static float luasPersegi(String sisi){
        float sisi1 = Float.parseFloat(sisi);
        float luasPersegi = sisi1 * sisi1;
        return luasPersegi;
    }
    
    public static float luasSegitiga(float alas, float tinggi){
        float luasSegitiga = alas * tinggi / 2;
        return luasSegitiga;
    }
    
}
