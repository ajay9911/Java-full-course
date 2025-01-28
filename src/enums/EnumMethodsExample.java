package enums;

enum Color {
    RED, GREEN, BLUE
}

public class EnumMethodsExample {
    public static void main(String[] args) {
        // Get all enum constants
        for (Color c : Color.values()) {
            System.out.println(c);
        }

        // Get ordinal (position of constant)
        System.out.println("Ordinal of RED: " + Color.RED.ordinal());

        // Get enum constant by name
        Color color = Color.valueOf("GREEN");
        System.out.println("Color: " + color);
    }
}

