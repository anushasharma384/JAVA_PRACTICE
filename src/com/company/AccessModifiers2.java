package com.company;
//We can use any access modifier in same class.
//Public modifier can be used anywhere class, package, subclass and even anywhere in the world.
//Protected modifier can be used in same class, same package subclass but not anywhere in world.
//Default(no) modifier can be used only in same class and package.
//Private modifier can only be used in same class. Other classes can not call that modifier directly but can access it using the method in that same class.

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
