package com.company;
//Write a java program that prints haha in arithematic exception and hehe in illegal argument exception.

public class ErrorExceptionsPracticeSet {
    public static void main(String[] args) {
        try{
            int a = 666/99;
        }
        catch (ArithmeticException e){
            System.out.println("haha");
        }
        catch (IllegalArgumentException e){
            System.out.println("hehe");
        }
    }
}
