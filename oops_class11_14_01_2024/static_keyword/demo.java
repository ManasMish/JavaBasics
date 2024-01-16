package oops_class11_14_01_2024.static_keyword;

public class demo {
    static String clg_name="The Testing Acadmey";
    int version=2024;
    public static void printname()
    {
        System.out.println("College name --> "+clg_name);
       // System.out.println("Version --> "+version);
    }
    public void printname2()
    {
        System.out.println("College name --> "+clg_name);
        System.out.println("Version --> "+version);
    }
}
