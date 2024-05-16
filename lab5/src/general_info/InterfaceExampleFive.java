package general_info;

// private method
public interface InterfaceExampleFive {
    default String getName() {
        return getLocalName();
    }

    private String getLocalName() {
        return "My Interface Name";
    }
}
