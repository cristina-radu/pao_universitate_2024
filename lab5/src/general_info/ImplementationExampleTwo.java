package general_info;

public class ImplementationExampleTwo implements InterfaceExampleOne, InterfaceExampleTwo, InterfaceExampleThree {
   @Override
    public String getName() {
        return "My interface name";
    }

/*    @Override
    public String addImplementation() {
       return "test";
    }*/
}
