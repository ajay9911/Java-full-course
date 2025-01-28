package opps.polymorphism.overriding;

import opps.abstraction.Car;

public class Test {
    public static void main(String[] args) {
        Dog dog=new Dog();
        Cat cat=new Cat();
        dog.sound();
        cat.sound();
    }
}
