package ex1;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class CarTwo implements Externalizable {
    private String name;
    private String color;
    private Integer price;

    public CarTwo() {}

    public CarTwo(String name, String color, Integer price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeUTF(color);
        out.writeUTF(String.valueOf(price));
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        color = in.readUTF();
        price = Integer.valueOf(in.readUTF());
    }

    @Override
    public String toString() {
        return "CarTwo{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
