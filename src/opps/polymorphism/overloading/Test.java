package opps.polymorphism.overloading;

public class Test {
    public static void main(String[] args) {
        Parents parents=new Child();
//        Child child= (Child) new  Parents();
        parents.parent();
//        child.child();
        Child child=new Child();
        child.child();
        child.parent();

    }
}
