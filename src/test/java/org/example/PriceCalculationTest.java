package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceCalculationTest {


    @org.junit.jupiter.api.Test
    void numberOfPaintors288m2() {
        int n = PriceCalculation.numberOfPaintors(288);
        assertEquals(2,n);
    }
    @org.junit.jupiter.api.Test
    void numberOfPaintors99m2() {
        int n = PriceCalculation.numberOfPaintors(99);
        assertEquals(1,n);
    }

    @org.junit.jupiter.api.Test
    void numberOfPaintors100m2() {
        int n = PriceCalculation.numberOfPaintors(100);
        assertEquals(2,n);
    }

    @org.junit.jupiter.api.Test
    void numberOfPaintors299m2() {
        int n = PriceCalculation.numberOfPaintors(299);
        assertEquals(2,n);
    }

    @org.junit.jupiter.api.Test
    void numberOfPaintors300m2() {
        int n = PriceCalculation.numberOfPaintors(300);
        assertEquals(3,n);
    }

    @org.junit.jupiter.api.Test
    void numberOfPaintors999m2() {
        int n = PriceCalculation.numberOfPaintors(999);
        assertEquals(3,n);
    }

    @org.junit.jupiter.api.Test
    void numberOfPaintors1000m2() {
        int n = PriceCalculation.numberOfPaintors(1000);
        assertEquals(4,n);
    }

    @org.junit.jupiter.api.Test
    void numberOfPaintorsNegarea() {
        int n = PriceCalculation.numberOfPaintors(-99);
        assertEquals(-1,n);
    }

    @Test
    void paintingPricewith0area() {
        double result = PriceCalculation.paintingPrice(0,7,6);
        assertEquals(-1,result);
    }

    @Test
    void paintingPricewithNegarea() {
        double result = PriceCalculation.paintingPrice(-9,7,6);
        assertEquals(-1,result);
    }

    @Test
    void paintingPricewithPositiveValues() {
        double result = PriceCalculation.paintingPrice(600,6,6);
        assertEquals(600,result);
    }

    @Test
    void paintingPricewithPositiveValues2() {
        double result = PriceCalculation.paintingPrice(452,7,4.5);
        assertEquals(703.11,result,0.01);
    }

    @Test
    void costHandWorkwith0area() {
        double result = PriceCalculation.costHandWork(0,70);
        assertEquals(-1,result);
    }

    @Test
    void costHandWorkwithNegaSalary() {
        double result = PriceCalculation.costHandWork(700,-3);
        assertEquals(-1,result);
    }

    @Test
    void costHandWorkwithBiggerThanZeroValues() {
        double result = PriceCalculation.costHandWork(1000,60);
        assertEquals(3750,result,0.01);
    }

    @Test
    void costHandWorkwithBiggerThanZeroValues2() {
        double result = PriceCalculation.costHandWork(277,75.50);
        assertEquals(1307.1,result,0.01);
    }

    @Test
    void totalPricebuildingIfareaIs0() {
        double result = PriceCalculation.totalPricebuilding(0,6,8,80);
        assertEquals(-1,result);
    }

    @Test
    void totalPricebuildingIfareaIsNeg() {
        double result = PriceCalculation.totalPricebuilding(-9,6,8,80);
        assertEquals(-1,result);
    }

    @Test
    void totalPricebuilding() {
        double result = PriceCalculation.totalPricebuilding(1000,10,6,60);
        assertEquals(5416.66,result,0.01);
    }

    @Test
    void totalPricebuildingX() {
        double result = PriceCalculation.totalPricebuilding(300,8,6,45);
        assertEquals(1243.75,result,0.01);
    }
}