package collections.set;

import java.util.HashSet;
import java.util.Set;

public class ExampleFour {

    public static void main(String[] args) {
        Set<String> students = new HashSet<>();
        students.add("Dana");
        students.add("Maria");
        students.add("Maria");
        System.out.println(students);
    }
}
