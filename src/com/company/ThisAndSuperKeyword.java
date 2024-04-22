package com.company;

// this is a reference that is used to refer to the properties of an object.
//

class EkClass{
    int a;
    public int getA(){
        return a;
    }
    EkClass(int a){
        this.a = a;
    }
    public int returnOne(){
        return 1;
    }
}
public class ThisAndSuperKeyword {
    public static void main(String[] args) {
        EkClass e = new EkClass(20);
        System.out.println(e.getA());
    }
}
