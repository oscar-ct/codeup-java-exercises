package shapes;

public class Square extends Rectangle {
    protected int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    public int getArea() {
        System.out.println("Overriding. . . ");
        return side * side;

    }

    public int getPerimeter() {
        System.out.println("Overriding. . . ");
        return 4 * side;
    }

}
