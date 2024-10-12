package com.flowers;

public class Tulip extends Flower {
    private int budSize;
    public Tulip(){
        super("Tulip");
        this.budSize = random.nextInt(16);
    }
    @Override
    public void print() {
        super.print();
        System.out.println("This tulip has"+ this.budSize + "cm bud");
    }
    @Override
    public void setFreshness(int i){
        super.setFreshness(i);
    }
}