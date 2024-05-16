package interfaces.ex5;

public interface InterfaceTwoDefaultMethod {
    default String printString(String value) {
        return value;
    }
}
