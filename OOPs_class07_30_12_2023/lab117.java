package OOPs_class07_30_12_2023;

public class lab117 {
    public static void main(String[] ref_name) {
        System.out.println("Run Fine");
        System.out.println(main(10));
        main("Manas");
    }
    public static int main(int n)
    {
        return n+101;
    }
    public static void main(String p)
    {
        System.out.println("I am another main function but JVM didn't recognised me!!!");
    }
}
