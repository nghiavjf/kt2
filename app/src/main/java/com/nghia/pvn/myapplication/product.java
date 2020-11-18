package com.nghia.pvn.myapplication;
import java.io.Serializable;

public class product implements Serializable {
    private String ten;
    private String cs;
    private int hinh;

    public product(String ten, String cs, int hinh) {
        this.ten = ten;
        this.cs = cs;
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }
    public String getcs() {
        return cs;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public void setcs(String cs) {
        this.cs = cs;
    }

    public int getHinh() {
        return hinh;
    }

    public void setPhoto(int photo) {
        this.hinh = photo;
    }

    public product() {
    }
}
