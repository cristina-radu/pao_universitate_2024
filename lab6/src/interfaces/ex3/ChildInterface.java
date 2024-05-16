package interfaces.ex3;

public interface ChildInterface extends InterfaceDefaultMethod {
    default void printString(String value) {
        System.out.println("From ChildInterface: "+ value);
    }
}
