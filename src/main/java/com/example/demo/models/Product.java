package com.example.demo.models;

public class Product {
    private double unitPrice;
    private int inven;

    public Product(double up, int inv) {
        this.unitPrice = up;
        this.inven = inv;
    }

    public int getInven() {
        return inven;
    }

    public double buyProduct(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("negative value");
        } else if (this.inven-num < 0) {
            throw new IllegalStateException("negative inventory");
        }
        this.inven -= num;
        return this.unitPrice*num;
    }
}
