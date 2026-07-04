package com.example.project.MediaInformasi;

public class ItemInformasiMenu {
    private int ResourceId;
    private String keterangan;

    public ItemInformasiMenu(int resourceId, String keterangan) {
        ResourceId = resourceId;
        this.keterangan = keterangan;
    }

    public int getResourceId() {
        return ResourceId;
    }

    public void setResourceId(int resourceId) {
        ResourceId = resourceId;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
