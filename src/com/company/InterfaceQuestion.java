package com.company;
//Create a class monkey with methods bite and jump. Create a class human which inherits class monkey and implements interface basicAnimal with methods eat and sleep and tribal with method dance.

class monkey{
    void jump(){
        System.out.println("Jumping like a monkey.");
    }
    void bite(){
        System.out.println("Biting like a monkey.");
    }
}
interface basicAnimal{
    void eat();
    void sleep();
}

interface tribal{
    void dance();
}

class human extends monkey implements basicAnimal, tribal{
    public void jump(){
        System.out.println("Jumping like a monkey.");
    }
    public void bite(){
        System.out.println("Biting like a monkey.");
    }

    @Override
    public void eat() {
        System.out.println("Eating like a basic animal.");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping like a basic animal.");
    }

    @Override
    public void dance() {
        System.out.println("Dancing like tribal.");
    }
}
public class InterfaceQuestion {
    public static void main(String[] args) {
        human hum = new human();
        hum.bite();
        hum.eat();
        hum.jump();
        hum.sleep();
        hum.dance();
    }
}
