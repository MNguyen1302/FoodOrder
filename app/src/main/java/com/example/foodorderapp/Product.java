package com.example.foodorderapp;

public class Product {
    private String id;
    private String name;
    private int price;
    private int qty;
    private String type;
    private int status;
    private int imageSrc;

    public Product() {

    }

    public Product(String id, String name, int price, int qty, String type, int status, int imageSrc) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.type = type;
        this.status = status;
        this.imageSrc = imageSrc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(int imageSrc) {
        this.imageSrc = imageSrc;
    }
}
