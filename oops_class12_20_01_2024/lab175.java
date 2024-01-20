package oops_class12_20_01_2024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class lab175 {
    public static void main(String[] args) {
        String path="C:/a.txt";
        try {
            FileInputStream f1=new FileInputStream(path);
        }
        catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
