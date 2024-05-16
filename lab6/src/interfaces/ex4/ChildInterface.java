package interfaces.ex4;

public interface ChildInterface extends InterfaceOneDefaultMethod, InterfaceTwoDefaultMethod {
    default void printString(String value) {
        InterfaceTwoDefaultMethod.super.printString(value);
    }
}
