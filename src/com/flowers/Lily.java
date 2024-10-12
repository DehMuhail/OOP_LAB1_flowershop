package com.flowers;

public class Lily extends Flower {
    private int flowersOnStem;

    public Lily(){
        super("Lily");
        this.flowersOnStem = random.nextInt(6);
    }
    @Override
    public void print() {
        super.print();
        System.out.println("This lily has" + this.flowersOnStem + "flowers");
    }
    @Override
    public void setFreshness(int i){
        this.freshness = i;
    }

}
