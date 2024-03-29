package com.company;

public class PrintingWays {
    public static void main(String[] args) {
        int a  = 6;
        float b = 5.66677f;

        //1st way:
        System.out.print("value of a is: "+a);
        System.out.print("  value of b is: "+b);

        //2nd way:
        System.out.println("value of a is: "+a);
        System.out.println("value of a is: "+a);

        //3rs way: Format printing(printf and format are same)
        System.out.printf("Value of a is %d and value of b is %f  ", a, b);
        System.out.format("Value of a is %d and value of b is %f", a, b);
        //if we want to print only two decimal places then we use %0.2f and like wise.
    }
}
