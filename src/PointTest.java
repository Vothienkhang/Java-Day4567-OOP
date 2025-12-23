public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point(2.5f, 3.5f);
        System.out.println(p1);

        MovablePoint p2 = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);
        System.out.println(p2);

        p2.move();
        System.out.println("After move: " + p2);
    }
}
