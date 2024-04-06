package com.company;

import java.util.Scanner;

public class ChangingTheInteger {
    static void change(int x){
        x = 98;
    }
    public static void main(String[] args) {
        int[] marks = {90, 89, 87, 68, 92, 60};
        int a = 45;
        change(a);
        System.out.println(STR."Changed value of a is: \{a}");
        //The answer will be 45 not 98 because the copy of a i.e. 45 is passed to the function to perform the function but the value of a is still 45 in the main function
    }
}

