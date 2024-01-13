package oops_class10_13_01_2024.interfaces;

public interface fatheri {
    void load1k();
    default void print()
    {
        System.out.println("I am default method");
    }
    static void print2()
    {
        System.out.println("I am static method");
    }

}
