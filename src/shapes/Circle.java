package shapes;

public class Circle {

    private double radius;
    private static int totalCircles = 0;

    public static int getTotalCircles() {
        return totalCircles;
    }

    public Circle() {
        totalCircles++;
    }

    public Circle (double radius) {
        this();
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

}
