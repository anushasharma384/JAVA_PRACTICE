package com.company;

public class ChangingTheArray {
    static void change(int[] arr){
        arr[0] = 98;
    }
    public static void main(String[] args) {
        int[] marks = {90, 98, 89, 87, 68, 70};
        change(marks);
        System.out.println(STR."Value of marks[0] after running the function change is: \{marks[0]}");
        //Here the value of marks[0] is changed to 98 and this is because an array object is created and marks is reference and value that is passed through the array to the function is the address where all the values are stored so when the array's element is accessed it is changed because the value is already changed at the address
    }
}