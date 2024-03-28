package com.company;
import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in first subject");
        float a = sc.nextFloat();
        System.out.println("Enter marks in second subject");
        float b = sc.nextFloat();
        System.out.println("Enter marks in third subject");
        float c = sc.nextFloat();
        System.out.println("Enter marks in fourth subject");
        float d = sc.nextFloat();
        System.out.println("Enter marks in fifth subject");
        float e = sc.nextFloat();
        float sum = a+b+c+d+e;
        float percentage = sum/5;
        System.out.print("Your percentage is: ");
        System.out.print(percentage);

    }
}
