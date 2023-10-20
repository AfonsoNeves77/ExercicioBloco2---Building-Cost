package org.example;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to your price calculation tool...");
        double area,ppl,pm2,slary;

            do{
                System.out.println("area: ");
                area = sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter paint's price per liter: ");
                ppl = sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter paint's capacity (per square meter): ");
                pm2 = sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter painter's salary/day: ");
                slary = sc.nextDouble();
                sc.nextLine();
            }while (area <= 0 || ppl <= 0 || pm2 <= 0 || slary <= 0 );


        System.out.println("""
                 --------- Menu ----------
                1-Calculate labor costs
                2-Calculate painting costs
                3-Calculate total costs""");

        int option = sc.nextInt();
        sc.nextLine();

        switch (option){
            case 1 :
                System.out.println("Labor cost's -----> " + PriceCalculation.costHandWork(area,slary));
                break;

            case 2 :
                System.out.println("Painting cost's-----> " + PriceCalculation.paintingPrice(area,ppl,pm2));
                break;
            case 3 :
                System.out.println("Total cost's-----> " + PriceCalculation.totalPricebuilding(area,ppl,pm2,slary));
                break;
            default:
                System.out.println("Invalid Value");

        }
    }


}