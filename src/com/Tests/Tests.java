package com.Tests;

import com.accesories.*;
import com.flowers.*;
import com.Bouquet.*;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.Bouquet.Bouquet;

public class Tests {

    @Test
    public void testAddFlower() {
        Bouquet bouquet = new Bouquet();
        Flower rose = new Rose();
        bouquet.addFlower(rose);
        assertTrue(bouquet.getFlowers().contains(rose));
    }

    @Test
    public void testAddAccessory() {
        Bouquet bouquet = new Bouquet();
        Accessory brooch = new Brooch();
        bouquet.addAccessory(brooch);
        assertTrue(bouquet.getAccessories().contains(brooch));
    }

    @Test
    public void testSortFreshness() {
        Bouquet bouquet = new Bouquet();
        Flower lily = new Lily();
        Flower tulip = new Tulip();
        lily.setFreshness(5);
        tulip.setFreshness(2);
        bouquet.addFlower(lily);
        bouquet.addFlower(tulip);
        bouquet.sortFreshness();
        assertEquals(bouquet.getFlowers().get(0), tulip);
    }

    @Test
    public void testBouquetPrice() {
        Bouquet bouquet = new Bouquet();
        Flower rose = new Rose();
        Accessory ribbon = new Ribbon();
        bouquet.addFlower(rose);
        bouquet.addAccessory(ribbon);
        int expectedPrice = rose.getPrice() + ribbon.getPrice();
        assertEquals(expectedPrice, bouquet.getBouquetPrice());
    }
}