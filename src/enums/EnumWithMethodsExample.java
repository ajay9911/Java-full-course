package enums;

enum Size {
    SMALL(30), MEDIUM(50), LARGE(70);

    private int sizeValue;

    Size(int sizeValue) {  // Constructor
        this.sizeValue = sizeValue;
    }

    public int getSizeValue() {
        return sizeValue;
    }
}

public class EnumWithMethodsExample {
    public static void main(String[] args) {
        for (Size s : Size.values()) {
            System.out.println(s + " size: " + s.getSizeValue());
        }
    }
}

