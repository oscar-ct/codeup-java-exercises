package shapes;

public class Square extends Quadrilateral {

    protected double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }


//    protected int side;
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//    public int getArea() {
//        System.out.println("Overriding. . . ");
//        return side * side;
//
//    }
//    public int getPerimeter() {
//        System.out.println("Overriding. . . ");
//        return 4 * side;
//    }

}
