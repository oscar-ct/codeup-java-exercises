package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

//    protected int length;
//    protected int width;

    public Rectangle(double length, double width) {
        super(length, width);

    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    void setLength(double length) {
        this.length = length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
    }


//     protected int length;
//     protected int width;
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//    public int getArea() {
//        return this.length * this.width;
//    }
//    public int getPerimeter() {
//        return 2 * this.length + 2 * this.width;
//    }

}
