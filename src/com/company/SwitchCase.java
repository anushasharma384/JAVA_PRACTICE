package com.company;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        switch (age){
            case 18:
                System.out.println("You are going to be an adult.");
                break;
            case 23:
                System.out.println("You are going to get a job.");
                break;
            case 60:
                System.out.println("You are going to get retired.");
                break;
            default:
                System.out.println("Enjoy your life");
        }
        System.out.println("Thanks for testing this code!");
    }
}
