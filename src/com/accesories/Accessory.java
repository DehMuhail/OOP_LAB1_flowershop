package com.accesories;

import java.util.Random;

public class Accessory {
    protected String AccesName;
    protected int color;
    protected int price;
    Random random = new Random();

    public Accessory(String AccesName){
        this.AccesName = AccesName;
        this.color = random.nextInt(10);
        this.price = random.nextInt(10);
    }

    public  void print(){
        System.out.println(AccesName + "'s price:" + this.price + '\t' + "Color:" + this.color + '\t');
    }
    public int getPrice(){
        return this.price;
    }
}
