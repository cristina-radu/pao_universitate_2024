package interfaces.ex4;

public interface InterfaceTwoDefaultMethod {
    default void printString(String value) {
        System.out.println("From InterfaceTwoDefaultMethod: "+ value);
    }
}
