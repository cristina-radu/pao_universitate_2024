package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ExampleTwo {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Dana");
        students.add("Maria");
        students.add("Dan");
        students.add("George");
        students.add("Georgiana");

        for(String student: students) {
            if(student.equals("Dan")) {
                students.remove(student);
            }
        }
        System.out.println(students);
    }
}
