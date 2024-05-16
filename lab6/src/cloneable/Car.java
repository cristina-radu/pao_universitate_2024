package cloneable;

public class Car implements Cloneable {
    private String name;
    private String color;
    private Integer price;

    private Company company;

    public Car(String name, String color, Integer price, Company company) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.company = company;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Car car = (Car)super.clone();
        car.setCompany((Company)car.getCompany().clone());
        return car;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Integer getPrice() {
        return price;
    }

    public Company getCompany() {
        return company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
