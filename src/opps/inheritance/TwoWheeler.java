package opps.inheritance;

public class TwoWheeler extends Vehicle{
    TwoWheeler(){
        noOFTires=2;
    }

    @Override
    public String toString() {
        return "TwoWheeler{" +
                "noOFTires=" + noOFTires +
                '}';
    }
}
