package enums;

enum Direction {
    NORTH, SOUTH, EAST, WEST
}

public class EnumSwitchExample {
    public static void main(String[] args) {
        Direction dir = Direction.EAST;

        switch (dir) {
            case NORTH -> System.out.println("You are moving north.");
            case SOUTH -> System.out.println("You are moving south.");
            case EAST -> System.out.println("You are moving east.");
            case WEST -> System.out.println("You are moving west.");
        }
    }
}

