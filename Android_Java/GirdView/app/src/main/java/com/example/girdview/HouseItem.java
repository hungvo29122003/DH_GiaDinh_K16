package com.example.girdview;

public class HouseItem {
    String title;
    int img;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public HouseItem(String title, int img) {
        this.title = title;
        this.img = img;
    }
}
