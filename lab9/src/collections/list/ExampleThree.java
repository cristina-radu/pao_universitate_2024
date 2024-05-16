package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleThree {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Dana");
        students.add("Maria");
        students.add("Dan");
        students.add("George");
        students.add("Georgiana");

        //the right way
        Iterator<String> iterator = students.iterator();
        while(iterator.hasNext()){
            String student = iterator.next();
            if(student.equals("Dan") || student.equals("George")) {
                iterator.remove();
            }
        }

        System.out.println(students);
    }
}
