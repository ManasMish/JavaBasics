package oops_class12_20_01_2024;

import java.io.File;
import java.io.FileReader;

public class lab172 {
    public static void main(String[] args) throws Exception {
        main("Pramod");

    }
    static void main(String a) throws Exception
    {
        FileReader file=new FileReader(new File("C://a/txt"));
        if(a.equalsIgnoreCase("a"))
        {
            throw new ArithmeticException();
        }
    }
}
