package opps.passby_value_and_reference;

class Person {
    String name;
}

public class PassByValueObjectExample {
    public static void modifyObject(Person person) {
        person.name = "Alice"; // This modifies the original object
        System.out.println("Inside method: " + person.name);
        person = new Person(); // Reassigning the reference
        person.name = "Bob";   // This does not affect the original object
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "John";
        System.out.println("Before method call: " + person.name);
        modifyObject(person);
        System.out.println("After method call: " + person.name);
    }
}

