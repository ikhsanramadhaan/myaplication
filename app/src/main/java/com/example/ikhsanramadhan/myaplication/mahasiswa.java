package com.example.ikhsanramadhan.myaplication;

/**
 * Created by ikhsan ramadhan on 2/19/2018.
 */

public class mahasiswa {
    private String nim,nama;

    public mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
