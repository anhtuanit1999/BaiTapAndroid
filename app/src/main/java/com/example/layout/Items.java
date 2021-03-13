package com.example.layout;

public class Items {
    private String name;
    private String price;
    private int itemImage;

    public Items(String name, String price, int itemImage) {
        this.name = name;
        this.price = price;
        this.itemImage = itemImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }
}
