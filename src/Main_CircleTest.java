public class Main_CircleTest {
    public static void main(String[] args) {
        CircleTest circleTest = new CircleTest();
        System.out.println(circleTest);

        circleTest = new CircleTest(3.5);
        System.out.println(circleTest);

        circleTest = new CircleTest(3.5, "Indigo", false);
        System.out.println(circleTest);
    }
}
