package com.flowers;

public class Rose extends Flower{
    private int thornsLength;
    public Rose(){
        super("Rose");
        this.thornsLength = random.nextInt(4);
    }
    @Override
    public void print() {
        super.print();
        System.out.println("This rose has"+ this.thornsLength+"mm");
    }
    @Override
    public void setFreshness(int i){
        super.setFreshness(i);
    }
}

