package opps.accessModifier;

public class Car {
    public String color;
    public String model;
    private double price;
    int date;


    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }

    public Car() {
    }

    public Car(String color, String model, double price) {
        this.color = color;
        this.model = model;
        this.price = price;
    }

    public Car(String color, String model, double price, int date) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.date = date;
    }
}
