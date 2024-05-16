package collections.map;

import collections.models.Student;

import java.util.HashMap;
import java.util.Map;

public class ExampleSeven {

    public static void main(String[] args) {
        Student dana = new Student(1, "Dana", "Popa", 2, "Universitate");
        Student maria = new Student(2, "Maria", "Tudorache", 1, "Politehnica");

        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put(1, "Dana");
        studentsMap.put(2, "Maria");

        Map<Integer, Student> studentsMap2 = new HashMap<>();
        studentsMap2.put(1, dana);
        studentsMap2.put(2, maria);

        Student mapMaria = studentsMap2.get(2);
        System.out.println(mapMaria);
    }
}
