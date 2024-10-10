package com.flowers;

public class Lily extends Flower {
    public Lily(){
        super("Lily");
    }
    @Override
    public void print() {
        super.print();
    }
    @Override
    public void setFreshness(int i){
        this.freshness = i;
    }

}
