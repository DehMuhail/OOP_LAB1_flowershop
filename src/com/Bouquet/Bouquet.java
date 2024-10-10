package com.Bouquet;


import java.util.ArrayList;
import java.util.Comparator;

import com.accesories.*;
import com.flowers.*;

public class Bouquet {
    private ArrayList<Flower> flowers;
    private ArrayList<Accessory> accessories;

    public Bouquet(){
        this.flowers = new ArrayList<>();
        this.accessories = new ArrayList<>();
    }

    public void addFlower(Flower flower){
        flowers.add(flower);
    }
    public void addAccessory(Accessory acc){
        accessories.add(acc);
    }

    public void deleteFlower(int i){
        if (i >= 0 && i < flowers.size()) {
            flowers.remove(i);
        }
        else {
            System.out.println("incorrect input");
        }
    }
    public void deleteAccessory(int i){
        if (i >= 0 && i < accessories.size()) {
            accessories.remove(i);
        }
        else {
            System.out.println("incorrect input");
        }
    }

    public ArrayList<Flower> getFlowers() {
        return this.flowers;
    }

    public ArrayList<Accessory> getAccessories() {
        return this.accessories;
    }

    public void check(){
        System.out.println("________Flowers in bouquet________");
        for (int i = 0; i < flowers.size(); i++){
            flowers.get(i).print();
        }
        System.out.println("________Accessories in bouquet________");
        for (int i = 0; i < accessories.size(); i++) {
            accessories.get(i).print();
        }
        this.bouquetPrice();
    }

    public void stemLength(int low, int high){
        for (int i = 0; i < flowers.size(); i++ ){
            if (flowers.get(i).getStem() >= low && flowers.get(i).getStem() <= high){
                flowers.get(i).print();
            }
        }
    }

    public void sortFreshness() {
        flowers.sort(new Comparator<Flower>() {
            public int compare(Flower f1, Flower f2) {
                return Integer.compare(f1.getFreshness(), f2.getFreshness());
            }
        });
        System.out.println("Sorted by freshness");
        check();
    }
    public void bouquetPrice(){
        int price = 0;
        for (int i = 0;i < flowers.size(); i++){
            price += flowers.get(i).getPrice();
        }
        for (int i = 0;i < accessories.size(); i++){
            price += accessories.get(i).getPrice();
        }
        System.out.println("Bouquet price:" + price);
    }
}


