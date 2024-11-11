package com.example.listview;

public class SinhVien {
    String name;
    int tuoi;

    public SinhVien(String name, int tuoi, int hinh) {
        this.name = name;
        this.tuoi = tuoi;
        this.hinh = hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    int hinh;

    public int getHinh() {
        return hinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public SinhVien(String name, int tuoi) {
        this.name = name;
        this.tuoi = tuoi;
    }
}
