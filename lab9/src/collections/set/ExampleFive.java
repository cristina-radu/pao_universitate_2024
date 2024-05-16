package collections.set;

import collections.models.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExampleFive {

    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>();
        Student dana = new Student(1, "Dana", "Popa", 2, "Universitate");
        Student maria = new Student(2, "Maria", "Tudorache", 1, "Politehnica");
        Student mircea = new Student(3, "Mircea", "Coman", 3, "Universitate");

        studentsList.add(dana);
        studentsList.add(maria);
        studentsList.add(mircea);

        System.out.println(studentsList);

        Set<Student> studentsSet = new HashSet<>();
        studentsSet.add(dana);
        studentsSet.add(maria);
        studentsSet.add(maria);

        System.out.println(studentsSet);
    }
}
