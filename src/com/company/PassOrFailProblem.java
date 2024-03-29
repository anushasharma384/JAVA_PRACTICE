package com.company;
import java.util.Scanner;
public class PassOrFailProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte m1, m2, m3;
        System.out.println("Enter your marks in subject1: ");
        m1 = sc.nextByte();
        System.out.println("Enter your marks in subject2: ");
        m2 = sc.nextByte();
        System.out.println("Enter your marks in subject3: ");
        m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.printf("Your overall percentage is %.2f\n", avg);
        if(m1>=33.0f && m2>=33.0f && m3>=33.0f && avg>=40.0f){
            System.out.println("Congratulations! You are pass.");
        }else{
            System.out.println("Sorry, you are fail");
        }
    }
}
