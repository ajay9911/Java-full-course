package opps;

public class Constructor {

    int id;
    String name;

    Constructor(int id,String name){
        this.id=id;
        this.name=name;

    }
    static int n;
    static {
        n=10;
    }
    {
        n++;
    }

    public static void main(String[] args) {
        Constructor constructor=new Constructor(1,"Ajay");
        System.out.println(constructor.id+constructor.name);
        System.out.println(n);
    }
}
