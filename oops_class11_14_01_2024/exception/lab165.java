package oops_class11_14_01_2024.exception;

public class lab165 {
    public static void main(String[] args) {
        try
        {

            String ip=args[0];
            int a=Integer.parseInt(ip);
            int b=10/a;
            System.out.println(a);
            System.out.println(b);
        }
        catch (ArithmeticException|NumberFormatException|ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I will always be executed");
        }
    }
}
