package opps;

public class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuel;
    int noOfSeats;

    public Car start(){
        System.out.println("Car is starting");
        return this;

    }
    public void drive(){
        System.out.println("Car is Drive");
    }

    public void addFuel(float currentFuel){
        this.currentFuel=currentFuel+currentFuel;
    }

    public float getCurrentFuel(){
        return currentFuel;
    }

    public static void main(String[] args) {

    }

}
