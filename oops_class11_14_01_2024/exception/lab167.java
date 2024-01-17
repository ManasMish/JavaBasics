package oops_class11_14_01_2024.exception;

import java.util.SortedMap;

public class lab167 {
    public static void main(String[] args) {
        try
        {
            int a=10/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getCause());
        }
        finally {
            System.out.println("I will always be there");
        }
    }
}
