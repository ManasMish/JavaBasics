package oops_class11_14_01_2024.exception;

public class lab162 {
    public static void main(String[] args) {
        String name = null;
//        System.out.println(name.trim());
//        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.trim()" because "name" is null
        try {
            name.trim();
            System.out.println("Inside try block");

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Outside try catch");
    }
}
// Exception --> Event that occur during execution of program,
// --> which disrupts normal flow of instructions.

