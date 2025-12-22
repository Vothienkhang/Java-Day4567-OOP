public class Cylinder extends CircleGeneral {
    private double height;

    // Constructor không tham số
    public Cylinder() {
        super();
        this.height = 1.0;
    }

    // Constructor radius + height
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // Constructor đầy đủ
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    // Getter & Setter
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    // Thể tích
    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[radius=" + getRadius() +
                ", color=" + getColor() +
                ", height=" + height +
                ", volume=" + getVolume() + "]";
    }
}
