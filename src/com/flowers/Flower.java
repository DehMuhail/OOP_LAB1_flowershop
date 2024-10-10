package com.flowers;

import java.util.Random;

public class Flower {
    protected int stem;
    protected int price;
    protected int freshness;
    protected String FlowerName;
    Random random = new Random();

    public Flower( String FlowerName){
        this.stem = random.nextInt(1,10);
        this.freshness = random.nextInt(1,10);
        this.FlowerName = FlowerName;
        this.price = random.nextInt(1,100);

    }

    public void print(){
        System.out.println(FlowerName+ "'s stem length: " + stem + ", and freshness: " + freshness + ", price " + price);
    }

    public int getStem(){
        return this.stem;
    }
    public int getFreshness(){
        return this.freshness;
    }
    public int getPrice(){
        return this.price;
    }

    public int compareTo(Flower other) {
        return Integer.compare(this.freshness, other.freshness);
    }

    public void setFreshness(int i){
        this.freshness = i;
    }
}
