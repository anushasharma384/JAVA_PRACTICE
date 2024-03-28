//Encrypt a grade by adding 8 to it and then decrypt it to the original grade.

package com.company;
import java.util.Scanner;
public class GradeEncryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade = 'B';
        grade = (char)(grade+8);
        System.out.println(grade);

        grade = (char)(grade-8);
        System.out.println(grade);
    }
}
