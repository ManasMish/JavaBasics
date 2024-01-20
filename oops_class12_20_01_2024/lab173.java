package oops_class12_20_01_2024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class lab173 {
    public static void main(String[] args){
            int a = 10 / 0; // --> unchecked exception
        try {
            FileReader f = new FileReader(new File("c://a.txt")); // --> checked exception
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
