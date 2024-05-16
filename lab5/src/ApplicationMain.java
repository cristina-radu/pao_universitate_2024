import example.*;
import general_info.ImplementationExampleOne;
import general_info.ImplementationExampleTwo;

import java.util.Arrays;

public class ApplicationMain {

    public static void main(String[] args) {
        ApplicationMain main = new ApplicationMain();

        ImplementationExampleOne implOne = new ImplementationExampleOne();
        System.out.println(implOne.getName());

        ImplementationExampleTwo implTwo = new ImplementationExampleTwo();
        System.out.println(implTwo.getName());
        System.out.println(implTwo.getDefaultName());

        int order = 3;
        Shape shape = main.getByOrder(order);
        System.out.println(shape.getArea());
        System.out.println(shape.getDescription());
        System.out.println(Shape.getTitle());
        System.out.println(Shape.DESCRIPTION);

        Car one = new Car("Dacia", 2010, "red");
        Car two = new Car("Volvo", 2007, "green");
        Car three = new Car("Ford", 2015, "white");

        Car[] carList = {one, two, three};

        CarComparator carComparator = new CarComparator();
        Arrays.sort(carList, carComparator);

        Arrays.stream(carList).forEach(elem -> System.out.println(elem.getName()));
    }

    private Shape getByOrder(int order) {
        Circle circle = new Circle(3);
        Square square = new Square(3);
        Rectangle rectangle = new Rectangle(3, 4);
        Triangle triangle = new Triangle(3, 4);
        switch (order) {
            case 1: return circle;
            case 2: return square;
            case 3: return rectangle;
            case 4: return triangle;
            default: throw new RuntimeException("Invalid order");
        }
    }

}

