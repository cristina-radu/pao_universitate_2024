package interfaces.ex5;

public interface InterfaceOneDefaultMethod {
    default void printString(String value) {
        System.out.println("From InterfaceOneDefaultMethod: "+ value);
    }
}
