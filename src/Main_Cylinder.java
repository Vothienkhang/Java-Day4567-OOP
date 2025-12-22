public class Main_Cylinder {
    public static void main(String[] args) {

        Cylinder cy1 = new Cylinder();
        System.out.println(cy1);

        Cylinder cy2 = new Cylinder(2.0, 5.0);
        System.out.println(cy2);

        Cylinder cy3 = new Cylinder(3.0, "green", 10.0);
        System.out.println(cy3);
    }
}
