package opps.abstraction;

public abstract class Vehicle {
    private int noOfTyres;


    public int getNoOfTyres() {
        return noOfTyres;
    }

    public void setNoOfTyres(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    public Vehicle(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    public void start(){
        System.out.println("Starting...");
    }

    public abstract void startSound();

}
