package com.company;

class modifiers{
    public int x = 5;
    protected int y = 9;
    int z = 8;
    private int a = 80;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class AccessModifiers2 {
    public static void main(String[] args) {
        modifiers md = new modifiers();
        md.meth1();
    }
}
