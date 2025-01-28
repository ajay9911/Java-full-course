package opps.inheritance;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        TwoWheeler twoWheeler=new TwoWheeler();
        System.out.println(twoWheeler);
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.toString());

        System.out.println(vehicle.equals(twoWheeler));



    }
}
