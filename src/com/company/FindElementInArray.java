package com.company;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,3,5,7,89,87,56,35,200,40};
        System.out.println("Enter the element to be searched:");
        int k = sc .nextInt();
        for(int i = 0; i < 10; i++){
            if(arr[i] == k){
                System.out.printf("Element %d is at %d position in the array.",k, i+1);
            }
        }
    }
}
