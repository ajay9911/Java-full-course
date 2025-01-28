package enums;

enum Planet {
    MERCURY, VENUS, EARTH, MARS;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}

public class EnumToStringExample {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.println("Planet: " + planet);
        }
    }
}

