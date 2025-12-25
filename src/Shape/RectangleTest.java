package Shape;

public class RectangleTest extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public RectangleTest() {

    }

    public RectangleTest(double width, double lenght) {
        this.width = width;
        this.length = lenght;
    }

    public RectangleTest(double width, double lenght, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = lenght;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "A Rectangle Test with width =" + width + " and length =" + getLength() +
                ", which is a subclass of" + super.toString();
    }
}
