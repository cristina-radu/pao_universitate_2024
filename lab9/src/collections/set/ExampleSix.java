package collections.set;

import collections.models.Student;

import java.util.HashSet;
import java.util.Set;

public class ExampleSix {

    public static void main(String[] args) {
        Set<Student> studentsSet2 = new HashSet<>();
        Student dana = new Student(1, "Dana", "Popa", 2, "Universitate");
        Student maria = new Student(2, "Maria", "Tudorache", 1, "Politehnica");
        Student maria2 = new Student(2, "Maria", "Tudorache", 1, "Politehnica");
        studentsSet2.add(dana);
        studentsSet2.add(maria);
        studentsSet2.add(maria2);

        System.out.println(studentsSet2);
    }
}
