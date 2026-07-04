package com.example.project.Prestasi;

public class ItemPrestasi {
    private  int resourceId;
    private String kategori;
    private String name;

    public ItemPrestasi(int resourceId, String kategori, String name) {
        this.resourceId = resourceId;
        this.kategori = kategori;
        this.name = name;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
