/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4;

import java.util.Objects;

/**
 *
 * @author pranadana
 */
public class toStringPegawai {
    private String nip;
    private String nama;

    public toStringPegawai(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }
    
    public String toString(){
        return this.nip + " - " + this.nama;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final toStringPegawai other = (toStringPegawai) obj;
        if (!Objects.equals(this.nip, other.nip)) {
            return false;
        }
        if (!Objects.equals(this.nama, other.nama)) {
            return false;
        }
        return true;
    }

    
}
