package oops_class11_14_01_2024.exception;

public class lab166 {
    public static void main(String[] args) {
        int a=0;
        try
        {
            a=Integer.parseInt(args[0]);
        }
        catch (NumberFormatException n)
        {
            n.printStackTrace();
        }
        try
        {
            int b=10/a;
        }
        catch (ArithmeticException at)
        {
            at.printStackTrace();
        }
        try
        {
            String ip=args[0];
        }
        catch (ArrayIndexOutOfBoundsException ar)
        {
            ar.printStackTrace();
        }
    }
}
