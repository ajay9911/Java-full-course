package maths;

public class Maths {
    public static void main(String[] args) {
        System.out.println(Math.abs(-99));
        for(int i=0;i<10;i++){
            System.out.println(Math.random());
        }

        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(10, 20));
        System.out.println(Math.addExact(2, 3));
        System.out.println(Math.subtractExact(10, 5));
    }
}
