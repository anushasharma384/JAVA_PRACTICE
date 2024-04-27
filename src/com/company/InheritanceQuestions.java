package com.company;

import java.util.Scanner;

class circle{
    Scanner sc = new Scanner(System.in);
    public int rad(){
        System.out.println("Enter the value of radius");
        int r = sc.nextInt();
        return r;
    }
    public void area(int radius){
        float area = 3.14f*radius*radius ;
        System.out.println("Area of circle is: "+ area);
    }
}
class cylinder extends circle{
    public int height(){
        System.out.println("Enter the value of height");
        int h = sc.nextInt();
        return h;
    }
    public void volume(int radius, int height){
        float vol = 3.14f*radius*radius*height;
        System.out.println("Volume of the cylinder is "+ vol);
    }
}
public class InheritanceQuestions {
    public static void main(String[] args) {
        circle c = new circle();
        int radc = c.rad();
        c.area(radc);
        cylinder cy = new cylinder();
        int radcy = cy.rad();
        int height = cy.height();
        cy.volume(radcy,height);
    }
}
