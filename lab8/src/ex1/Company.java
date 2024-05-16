package ex1;

import java.io.Serializable;

public class Company implements Serializable {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                "} with hashCode: " + hashCode();
    }
}
