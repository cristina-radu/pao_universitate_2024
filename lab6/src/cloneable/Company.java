package cloneable;

public class Company implements Cloneable {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
