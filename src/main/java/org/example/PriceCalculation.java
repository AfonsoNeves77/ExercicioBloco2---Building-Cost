package org.example;

public class PriceCalculation {

    public static int numberOfPaintors(double area){
        if(area <= 0 ){
            return -1;
        }
        else {
            if (area < 200) {
                return 1;
            }
            if(area < 300){
                return 2;
            }

            if(area < 1000){
                return 3;
            }
            return 4;
        }

    }

    public static double costHandWork(double area, double salaryPaintor){
        if(area > 0 && salaryPaintor > 0){
            int nPaintors = numberOfPaintors(area);
            double costPerDay = salaryPaintor * nPaintors;
            double areaPaintedPerday = nPaintors * 16;
            double amountOfDays = area/areaPaintedPerday;
            return amountOfDays * costPerDay;
        }
        return -1;

    }

    public static double paintingPrice(double area, double pricePaintPerL, double rendimentoM2){
        if(area > 0 && pricePaintPerL > 0 && rendimentoM2 > 0){
            return (area/rendimentoM2)*pricePaintPerL;
        }
        return -1;

    }

    public static double totalPricebuilding(double area, double pricePaintPerL, double rendimentoM2, double salaryPaintor){
        if(area > 0 && salaryPaintor > 0 && pricePaintPerL > 0 && rendimentoM2 > 0){
            return costHandWork(area,salaryPaintor) + paintingPrice(area,pricePaintPerL,rendimentoM2);
        }
        return -1;
    }
}
