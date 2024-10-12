package com.Bouquet;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.accesories.*;
import com.flowers.*;

public class Bouquet {
    private List<Flower> flowers;
    private List<Accessory> accessories;

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

    public List<Flower> getFlowers() {
        return this.flowers;
    }

    public List<Accessory> getAccessories() {
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

        System.out.println("____Flowers with right length___");
        flowers.stream().filter(f -> isStemInBounds(low, high, f))
                .forEach(Flower::print);

        for (Flower f : flowers) {

        }


        for (int i = 0; i < flowers.size(); i++ ){
            if (isStemInBounds(low, high, flowers.get(i))){
                System.out.println("____Flowers with right length___");
                flowers.get(i).print();


            }
        }
    }

    private boolean isStemInBounds(int low, int high, Flower flower) {
        int stem = flower.getStem();
        return stem >= low && stem <= high;
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
        int flowersPrice = 0;
        for (int i = 0;i < flowers.size(); i++){
            flowersPrice += flowers.get(i).getPrice();
        }
        int accessoriesPrice = accessories.stream().mapToInt(Accessory::getPrice).sum();
//        for (int i = 0;i < accessories.size(); i++){
//            flowersPrice += accessories.get(i).getPrice();
//        }
        System.out.println("Bouquet price:" + (flowersPrice + accessoriesPrice));
    }
}


