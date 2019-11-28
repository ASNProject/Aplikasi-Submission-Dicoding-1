package com.asnproject.submission1;


import java.io.Serializable;

public class makanan implements Serializable {
    private String makanan;
    private String detail;
    private String deskripsi;
    private String sumber;
    private int gambar;

    public String getSumber() {return sumber;}

    public void setSumber(String sumber) {this.sumber = sumber;}

    public String getDeskripsi() {return deskripsi;}

    public void setDeskripsi(String deskripsi) {this.deskripsi = deskripsi;}

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }


}
