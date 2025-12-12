// [Thực hành] Lớp hình chữ nhật (v.2023)

import java.awt.*;

public class Rectangle {

        // Khai báo các thuộc tính (properties), định nghĩa các phương thức khởi tạo (contructor)
        double width, height;
        public Rectangle() {}; // Hàm khởi tạo

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Định nghĩa các phương thức getArea(), getPerimeter(), display()

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "The rectangle has: " + "width=" + this.width + "\t" + "height=" + this.height + "\n";
    }
}
