package com.company;

import java.util.Scanner;

public class PatternQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        Print the following pattern:
//        * * * *
//        * * *
//        * *
//        *
        System.out.println("Enter the number of lines you want in pattern: ");
        int n = sc.nextInt();
        for(int i = n; i>0; i--){
            for(int j = n; j>n-i; j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
