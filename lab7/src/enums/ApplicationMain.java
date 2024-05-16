package enums;

import java.util.Arrays;

public class ApplicationMain {

    public static void main(String[] args) {
/*        enums.MenuSimpleEnum menuSimpleEnum = enums.MenuSimpleEnum.TWO;
        enums.MenuSimpleEnum[] enumValues = enums.MenuSimpleEnum.values();
        Arrays.stream(enumValues).forEach(elem ->
                System.out.println(elem.name()));*/


/*        enums.MenuEnum[] menuEnum = enums.MenuEnum.values();
        Arrays.stream(menuEnum).forEach(elem ->
                System.out.println(elem.getKey()));*/

        MenuEnum foundEnum = MenuEnum.getForKey(2);
        if(foundEnum == null) {
            System.out.println(" No enum with key: "+ 2);
        } else {
            System.out.println("Enum found is: "+ foundEnum.name());
        }
    }
}
