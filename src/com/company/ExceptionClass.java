package com.company;

import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return super.toString() + " I am toString()";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " I am getMessage()";
    }
}
public class ExceptionClass {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        a = sc.nextInt();
        if(a<100){
            try {
                //Keyword throw is used to throw an exception explicitly by the programmer.
                throw new MyException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                //the next one is not an error its an exception message
                e.printStackTrace(); //This tells us about which error is thrown due to which line.
                System.out.println("finished");
            }
        }
    }
}
