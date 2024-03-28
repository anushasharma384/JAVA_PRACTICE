//find whether a given number is greater than a user entered number or not
package com.company;
import java.util.Scanner;
public class CompareTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 100;
        System.out.println("Enter a number:");
        int b = sc.nextInt();
        System.out.println(b>a);
    }
}
