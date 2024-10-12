package com.accesories;

public class Ribbon extends Accessory {
    private int length;
    public Ribbon(){
        super("Brooch");
        this.length = random.nextInt(10, 40) ;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("it's length:" + this.length+"cm");
    }
}