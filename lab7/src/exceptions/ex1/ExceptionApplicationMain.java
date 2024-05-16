package exceptions.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionApplicationMain {
    public static void main(String[] args) {

        try {
            System.out.println("In try");
         //   throw new Exception("For test");
        } catch (Exception ex) {
            System.out.println("In catch");
        } finally {
            System.out.println("In finally");
        }

        try{
            Scanner file = new Scanner(new File("test.txt"));
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("In Finally");
        }
    }
}
