package com.company;

import java.util.Scanner;

public class FibonacciSeries {
    static void fibonacci(int n){
        int n1 = 0;
        int n2 = 1;
        int n3,i;
        if(n == 1){
            System.out.print(n1);
        }
        else if(n == 2){
            System.out.print(n1+" "+n2);
        }
        else{
            System.out.print(n1+" "+n2);
        }
        for(i = 0; i < n-2; i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how much numbers you want to print in fibonacci series: ");
        int n = sc.nextInt();
        fibonacci(n);
    }
}
