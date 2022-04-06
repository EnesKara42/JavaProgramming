package çalışmalar;

public class Triangle_class_11_1 extends SimpleGeometricObject{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    Triangle_class_11_1() {

    }

    Triangle_class_11_1(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        double s = 1 / 4.0 * Math.sqrt((side1 + side2 + side3) * (side1 + side2 - side3) * (side1 + side3 - side2) * (side2 + side3 - side1)) ;
        return s;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Triangle: side1 = " + side1 +
                " side2 = " + side2 + " side3 = " + side3;
    }

}

