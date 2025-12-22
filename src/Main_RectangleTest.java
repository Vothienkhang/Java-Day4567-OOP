public class Main_RectangleTest {
    public static void main(String[] args) {

        RectangleTest rectangle = new RectangleTest();
        System.out.println(rectangle);

        rectangle = new RectangleTest(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new RectangleTest(2.3, 5.8, "orange", true);
        System.out.println(rectangle);
    }
}
