import cloneable.Car;
import cloneable.Company;
import impl.ex6.ExampleSixImpl;
import interfaces.ex1.ExampleOneImpl;
import interfaces.ex2.ExampleTwoImpl;
import interfaces.ex3.ExampleThreeImpl;
import interfaces.ex4.ExampleFourImpl;

public class ApplicationMain {

    public static void main(String[] args) {

/*        Car car = new Car("Logan", "red", 13000);
        try {
            Car clone = (Car) car.clone();
            System.out.println(clone.getName());
        } catch (CloneNotSupportedException ex) {
            System.out.println("Class does not implement interface");
        }*/

/*        Company company = new Company("Dacia");
        Car car = new Car("Logan", "red", 13000, company);
        System.out.println("Original Car object hash: "+ car);
        System.out.println("Original Company object hash: "+ company);


        try {
            Car clone = (Car) car.clone();
            System.out.println("Cloned Car object hash: "+ clone);
            System.out.println(clone.getName());
            System.out.println(clone.getCompany());
            System.out.println("Cloned Company object hash: "+ clone.getCompany());
            if(clone.getCompany() != null){
                System.out.println(clone.getCompany().getName());
            }
        } catch (CloneNotSupportedException ex) {
            System.out.println("Class does not implement interface");
        }*/


/*        ExampleOneImpl exampleOne = new ExampleOneImpl();
        exampleOne.printString("test");*/

/*        ExampleTwoImpl exampleTwo = new ExampleTwoImpl();
        exampleTwo.printString("test");*/

/*        ExampleThreeImpl exampleThree = new ExampleThreeImpl();
        exampleThree.printString("test");*/

/*        ExampleFourImpl exampleFour = new ExampleFourImpl();
        exampleFour.printString("test");*/

        ExampleSixImpl exampleSix = new ExampleSixImpl();
        exampleSix.printString("test");
    }
}
