package example;

public class Car implements Comparable<Car> {
    private String name;
    private int year;
    private String color;

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public Car(String name, int year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    public int compareTo(Car car) {
        return this.year - car.year;
    }
}
