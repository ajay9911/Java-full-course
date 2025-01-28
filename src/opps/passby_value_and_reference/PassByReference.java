package opps.passby_value_and_reference;

public class PassByReference {

    public static void main(String[] args) {
        Point first =new Point(4,8);
        System.out.println(first);
        move(first);
        System.out.println(first);
    }

    public static void move(Point p){
        p.x++;
        p.y++;
        System.out.println(p);

    }
    public static class Point{
        int x;

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        int y;

        public Point(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
}
