package general_info;

public interface InterfaceExampleSix {
    static String getName() {
        return getLocalName();
    }

    private static String getLocalName() {
        return "My interface name";
    }
}
