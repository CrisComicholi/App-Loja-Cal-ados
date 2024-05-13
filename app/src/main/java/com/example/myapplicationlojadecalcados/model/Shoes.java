package com.example.myapplicationlojadecalcados.model;

public class Shoes {
    int imgShoes;
    String shoesName;
    String shoesDescription;
    String price;

    public Shoes(int imgShoes, String shoesName, String shoesDescription, String price) {
        this.imgShoes = imgShoes;
        this.shoesName = shoesName;
        this.shoesDescription = shoesDescription;
        this.price = price;
    }

    public int getImgShoes() {
        return imgShoes;
    }

    public String getShoesName() {
        return shoesName;
    }


    public String getShoesDescription() {
        return shoesDescription;
    }


    public String getPrice() {
        return price;
    }

}
