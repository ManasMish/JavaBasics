package oops_class10_13_01_2024.polymorphism.methodoverloading;

public class rc {
    public static void main(String[] args) {
        new person().gift();
        new person().gift("manas");
        new person().gift(1.1);
        new person().gift(3.14);
    }
}
