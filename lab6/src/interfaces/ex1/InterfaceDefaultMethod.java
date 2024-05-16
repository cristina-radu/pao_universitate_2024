package interfaces.ex1;

public interface InterfaceDefaultMethod {

    default void printString(String value) {
        System.out.println(value);
    }
}
