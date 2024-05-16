package impl.ex6;

public interface InterfaceDefaultMethod {
    default void printString(String value) {
        System.out.println("From InterfaceDefaultMethod: "+ value);
    }
}
