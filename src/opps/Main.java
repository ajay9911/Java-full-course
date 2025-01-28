package opps;

public class Main {
    public static void main(String[] args) {
//        Car car=new Car();
//        car.drive();
//        System.out.println(car.currentFuel);

        Car swift =new Car();
//        swift.start();
//        swift.drive();

        Car car=swift.start();
        car.drive();

       swift.addFuel(10);
        System.out.println(swift.currentFuel);

    }
}
