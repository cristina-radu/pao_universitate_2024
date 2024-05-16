package example;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    public int compare(Car carOne, Car carTwo){
        return carOne.compareTo(carTwo);
    }
}
