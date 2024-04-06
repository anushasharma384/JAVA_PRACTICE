package com.company;

import java.util.Scanner;

class Employee{
    int salary;
    String name;
    String changedName;
    public void getSalary(){
        System.out.println("Your Salary is: Rs "+salary);
    }
    public void getName(){
        System.out.println("Your name is "+name);
    }
    public void changename(String n){
        name = n;
        System.out.println("Your changed name is "+name);
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        Employee anusha = new Employee();
        anusha.salary = 120000;
        anusha.name = "Anusha Sharma";
        anusha.changedName = "Sejal Jain";
        anusha.getName();
        anusha.getSalary();
        anusha.changename(anusha.changedName);


    }
}
