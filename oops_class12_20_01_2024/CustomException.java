package oops_class12_20_01_2024;

public class CustomException extends Exception{
    public CustomException(String msg)
    {
        super(msg);
        System.out.println("If i got this custome exception");
    }
}
