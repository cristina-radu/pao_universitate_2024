package interfaces.ex3;

public interface InterfaceDefaultMethod {
    default void printString(String value) {
        System.out.println(value);
    }
}
