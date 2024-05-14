package com.company;

//In english, interface is a point where two systems meet and interact.
//In java, interface is a group of related methods with empty bodies.
//To form interface we have to use the keyword 'interface' instead of 'class'.
//Whenever we use interface methods we have to make them public.
//Interface is a bit like class but with significant differences
//We can create a reference of interfaces but not objects


interface bicycle{
    //property
    int a = 38;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface hornBicycle{
    void blowHorn();
}


//You can't use more than one class after extends in abstract classes but can use more than one interfaces after implements in interfaces.
class AvonCycle implements bicycle, hornBicycle{
    @Override
    public void speedUp(int increment) {
        System.out.println("Speeding Up.....");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brake.....");
    }
    public void blowHorn(){
        System.out.println("pee pee poo poo");
    }
}
public class Interface {
    public static void main(String[] args) {
        AvonCycle anusha = new AvonCycle();
        anusha.applyBrake(1);
        //Can create a property in the interfaces.
        System.out.println(anusha.a);
        //Can not modify the property of an interface because it is final.
        //anusha.a = 387;
        anusha.blowHorn();
    }
}
