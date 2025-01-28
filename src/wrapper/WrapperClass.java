package wrapper;

public class WrapperClass {
    public static void main(String[] args) {
        Integer a=10;
        System.out.println(a.byteValue());
        System.out.println(a.getClass());
        System.out.println(a.describeConstable());

        int b=a;
        System.out.println(b);

    }
}
