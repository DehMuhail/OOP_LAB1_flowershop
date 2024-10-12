package com.accesories;


public class Brooch extends  Accessory {
    private int size;
    public Brooch(){
        super("Brooch");
        this.size = random.nextInt(10, 30);
    }
    @Override
    public void print(){
        super.print();
        System.out.println("and it's size:" + this.size+"mm");
    }
}
