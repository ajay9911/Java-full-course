package opps.abstraction;

public class Car extends Vehicle{
    private int noOfDoors;
    public Car(){
        super(4);

    }

    @Override
    public void startSound() {
        System.out.println("Make Start Sound");
    }
}
