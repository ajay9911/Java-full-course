package opps.polymorphism.overriding;

public class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cats meow");
    }
}