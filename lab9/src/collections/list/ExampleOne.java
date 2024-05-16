package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ExampleOne {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
            students.add("Dana");
            students.add("Maria");
            students.add("Dan");
            students.add("George");
            students.add("Georgiana");

        // not a good idea
        for(int i = 0; i<students.size();i++) {
            if (students.get(i).equals("Dan") || students.get(i).equals("George")) {
                students.remove(i);
            }
        }
        System.out.println(students);
    }
}
