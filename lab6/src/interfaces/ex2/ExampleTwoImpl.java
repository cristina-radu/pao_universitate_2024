package interfaces.ex2;

public class ExampleTwoImpl implements ChildInterface {
    @Override
    public void printString(String value) {
        System.out.println("From Impl object: " + value);
    }
}
