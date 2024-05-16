package ex1;

import java.io.Serializable;

public class Car implements Serializable {
    private String name;
    private String color;
    private Integer price;

    private transient String owner;

    private Company company;

    public Car(String name, String color, Integer price, Company company, String owner) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.company = company;
        this.owner = owner;
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

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", company=" + company +
                ", owner=" + owner +
                "} with hashCode: "+ hashCode();
    }
}
