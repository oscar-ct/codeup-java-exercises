package shapes;

public class ShapesTest {
    public static void main(String[] args) {

    Measurable myShape = new Rectangle(5, 4);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());


    Measurable myShape1 = new Square(5);
        System.out.println(myShape1.getPerimeter());
        System.out.println(myShape1.getArea());



//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());


    }
}
