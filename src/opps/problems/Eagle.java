package opps.problems;

public class Eagle extends Bird{
    protected Eagle(String breed) {
        super(breed);
    }

    @Override
    public void fly() {
        System.out.println("Flying");

    }
}
