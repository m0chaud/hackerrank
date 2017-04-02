package com.day2;

import java.util.Scanner;

public class Arithmatic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tipCost = mealCost * (tipPercent/100.0);
        double taxCost = mealCost * (taxPercent/100.0);
        double totalMealCost = mealCost + tipCost + taxCost;
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(totalMealCost);
        System.out.println("The total meal cost is "+totalCost+" dollars.");
        // Print your result
    }
}
