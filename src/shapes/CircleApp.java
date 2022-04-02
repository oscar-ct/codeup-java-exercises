package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {

        Input input;
        do {
            input = new Input();
            System.out.println("Enter the radius of a circle: ");
            Circle circleTest = new Circle(input.getDouble());

            System.out.println("The circle has an area of: " + circleTest.getArea());
            System.out.println("The circle has an circumference of: " + circleTest.getCircumference());

            System.out.println("Continue? yes / no");

        } while (input.yesNo());

//        Circle circleCount = new Circle();

        System.out.println("You created " + Circle.getTotalCircles() + " circles");

    }
}

