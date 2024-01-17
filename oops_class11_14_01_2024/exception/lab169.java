package oops_class11_14_01_2024.exception;

public class lab169 {
    public static void main(String[] args) {
        extracted2();
        System.out.println("main executed");
    }
    private static void extracted2()
    {
        extracted1();
        System.out.println("extracted2 executed");
    }
    private static void extracted1()
    {
        extracted();
        System.out.println("extracted1 executed");
    }
    private static void extracted()
    {
        try
        {
            String name =null;
            name.length();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("extracted executed");
    }
}