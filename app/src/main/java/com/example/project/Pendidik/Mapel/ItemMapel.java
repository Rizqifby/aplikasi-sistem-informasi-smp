package com.example.project.Pendidik.Mapel;

public class ItemMapel {
    private int foto;

    private String nama;

    private String pelajaran;

    public ItemMapel(int foto, String nama, String pelajaran) {
        this.foto = foto;
        this.nama = nama;
        this.pelajaran = pelajaran;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPelajaran() {
        return pelajaran;
    }

    public void setPelajaran(String pelajaran) {
        this.pelajaran = pelajaran;
    }
}
