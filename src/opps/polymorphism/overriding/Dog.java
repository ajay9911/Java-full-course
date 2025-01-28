package opps.polymorphism.overriding;

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dogs bark");
    }
}

