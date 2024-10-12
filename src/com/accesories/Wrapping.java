package com.accesories;
import java.util.stream.Stream;


public class Wrapping extends Accessory {
    private int transparency;
    public Wrapping(){
        super("wrapping");
        this.transparency = random.nextInt(2);
    }
    @Override
    public void print(){
        super.print();
        Stream.of(transparency)
                .map(value -> value == 1 ? "This wrapping is transparent" : "This  wrapping is opaque ")
                .forEach(System.out::println);
    }
}
