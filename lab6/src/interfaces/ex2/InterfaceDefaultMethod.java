package interfaces.ex2;

public interface InterfaceDefaultMethod {
    default void printString(String value) {
        System.out.println(value);
    }
}
