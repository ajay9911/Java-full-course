package opps.accessModifier;

public class Test {
    public static void main(String[] args) {
        Car car=new Car();
        car.color="Red";
        car.model="2025";
//        System.out.println(car);

        Car car1=new Car("Black","2024",100000);
//        System.out.println(car1);
        car.date=10;
        System.out.println(car);

    }
}
