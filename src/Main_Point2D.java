public class Main_Point2D {
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        System.out.println(p1);

        Point2D p2 = new Point2D(2.5f, 3.5f);
        System.out.println(p2);

        p2.setXY(4.0f, 5.0f);
        System.out.println(p2);
    }
}
