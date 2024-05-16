package collections.models;

import java.util.Objects;

public class Student {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer year;
    private String college;

    public Student(Integer id, String firstName, String lastName, Integer year, String college) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.college = college;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(year, student.year) && Objects.equals(college, student.college);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, year, college);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", college='" + college + '\'' +
                '}';
    }
}
