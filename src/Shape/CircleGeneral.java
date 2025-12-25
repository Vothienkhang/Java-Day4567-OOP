package Shape;// ┌──────────────────────────┐
//│          Circle          │
//├──────────────────────────┤
//│ - radius: double         │
//│ - color: String          │
//├──────────────────────────┤
//│ + Circle()               │
//│ + Circle(radius: double) │
//│ + Circle(radius: double, │
//│   color: String)         │
//│ + getRadius(): double    │
//│ + setRadius(double)      │
//│ + getColor(): String     │
//│ + setColor(String)       │
//│ + getArea(): double      │
//│ + toString(): String     │
//└────────────▲─────────────┘
//             │ extends
//┌──────────────────────────┐
//│         Cylinder         │
//├──────────────────────────┤
//│ - height: double         │
//├──────────────────────────┤
//│ + Cylinder()             │
//│ + Cylinder(radius,       │
//│   height)                │
//│ + Cylinder(radius,       │
//│   color, height)         │
//│ + getHeight(): double    │
//│ + setHeight(double)      │
//│ + getVolume(): double   │
//│ + toString(): String     │
//└──────────────────────────┘

public class CircleGeneral {
    private double radius;
    private String color;

    // Constructor không tham số
    public CircleGeneral() {
        this.radius = 1.0;
        this.color = "red";
    }

    // Constructor có radius
    public CircleGeneral(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    // Construcor đầy đủ
    public CircleGeneral(double radius, String color) {
        this.radius = radius;
        this.color = "red";
    }

    // Getter & Setter
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Diện tích Circle
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Shape.CircleGeneral{" + "radius=" + radius + ", color=" + color + ", area=" + getArea() + '}';
    }
}
