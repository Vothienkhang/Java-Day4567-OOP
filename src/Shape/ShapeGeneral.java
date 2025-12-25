package Shape;// classDiagram
//class Shape.Shape {
//  - color : String
//  - filled : boolean
//  + Shape.Shape()
//  + Shape.Shape(color:String, filled:boolean)
//  + getColor() : String
//  + setColor(color:String) : void
//  + isFilled() : boolean
//  + setFilled(filled:boolean) : void
//  + toString() : String
//}
//
//class Triangle {
//  - side1 : double = 1.0
//  - side2 : double = 1.0
//  - side3 : double = 1.0
//  + Triangle()
//  + Triangle(side1:double, side2:double, side3:double)
//  + getSide1() : double
//  + getSide2() : double
//  + getSide3() : double
//  + getArea() : double
//  + getPerimeter() : double
//  + toString() : String
//}
//
//Triangle --|> Shape.Shape : extends

public class ShapeGeneral {
    private String color = "green";
    private boolean filled = true;
    public ShapeGeneral() {
    }

    public ShapeGeneral(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter & Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape.ShapeGeneral{" + "color=" + color + ", filled=" + filled + '}';
    }
}
