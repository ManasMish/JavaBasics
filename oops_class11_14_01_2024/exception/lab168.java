package oops_class11_14_01_2024.exception;

import java.io.File;
import java.io.FileReader;

public class lab168 {
    public static void main(String[] args) {
        try{
            String path="C://a.txt";
            File f=new File(path);
            FileReader fr=new FileReader(f);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
