import ex1.Car;
import ex1.CarTwo;
import ex1.Company;
import ex2.Node;

import java.io.*;

public class ApplicationMain {

    public static void main(String[] args) {
        Company company = new Company("Dacia");
        Car car = new Car("Logan", "red", 10000, company, "John");
        System.out.println(company);
        System.out.println(car);

        System.out.println("Writing object to file");
        String pathOne = "myObjectFile.bin";
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(pathOne);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(car);
        } catch (FileNotFoundException fnfe) {
            System.out.println("File with path "+ pathOne + " does not exist.");
        } catch (IOException ioException) {
            System.out.println("There was a problem while serializing object.");
        } finally {
            try {
                if(oos != null) {
                    oos.close();
                }
                if(fos != null) {
                    fos.close();
                }
            } catch (IOException io) {
                System.out.println("There was a problem when closing the streams.");
            }

        }


        System.out.println("Reading object from file.");
        try( ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pathOne))) {
            Car fileObject = (Car) ois.readObject();
            System.out.println(fileObject);
            System.out.println(fileObject.getCompany());
        }  catch (ClassNotFoundException fnfe) {
            System.out.println("File with path "+ pathOne + " does not exist.");
        } catch (IOException ioException) {
            System.out.println("There was a problem while serializing object.");
        }


        System.out.println("Example with list");
        Node first = null;
        Node last = null;

        for(int i = 0; i < 10; i++) {
            Node newNode = new Node(String.valueOf(i));
            if (first == null) {
                first = newNode;
                last = newNode;
            } else {
                last.setNextNode(newNode);
                last = newNode;
            }
        }
        last.setNextNode(first);

        System.out.println("List which will be serialized: ");
        Node helper = first;

        do {
            System.out.println(helper.getValue());
            helper = helper.getNextNode();
        } while (helper != first);

        String pathTwo = "list.bin";
        System.out.println("Writing list to file");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(pathTwo))) {
            objectOutputStream.writeObject(first);
        } catch (Exception ex) {
            System.out.println("There was a problem while writing the list.");
        }

        System.out.println("Reading from file");
        Node fileFirst = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(pathTwo))) {
            fileFirst = (Node) objectInputStream.readObject();
        } catch (ClassNotFoundException fnfe) {
            System.out.println("File with path "+ pathTwo + " does not exist.");
        } catch (IOException ioException) {
            System.out.println("There was a problem while serializing object.");
        }

        Node helperTwo = fileFirst;
        do {
            System.out.println(helperTwo.getValue());
            helperTwo = helperTwo.getNextNode();
        } while (helperTwo != fileFirst);


        CarTwo carTwo = new CarTwo("Duster", "black", 20000);

        String pathThree = "externalizable.ser";
        try(ObjectOutputStream oosTwo = new ObjectOutputStream(new FileOutputStream(pathThree))){
            oosTwo.writeObject(carTwo);
        } catch (Exception ex){
            System.out.println("There was a problem white writing in file");
        }

        try(ObjectInputStream oisTwo = new ObjectInputStream(new FileInputStream(pathThree))) {
            CarTwo fileCarTwo = (CarTwo) oisTwo.readObject();
            System.out.println(fileCarTwo);
        } catch (Exception ex){
            System.out.println("There was a problem white reading in file");
        }
    }
}
