public class Main_Point3D {
    public static void main(String[] args) {
        Point3D p1 = new Point3D();
        System.out.println(p1);

        Point3D p2 = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println(p2);

        p2.setXYZ(4.0f, 5.0f, 6.0f);
        System.out.println(p2);
    }
}
