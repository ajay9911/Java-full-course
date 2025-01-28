package challenges;

public class FinalInitialize {
    final int num;
    FinalInitialize(){
        num=10;
    }

    @Override
    public String toString() {
        return "FinalInitialize{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        FinalInitialize f=new FinalInitialize();
        System.out.println(f);


    }
}
