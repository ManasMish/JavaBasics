package oops_class11_14_01_2024.static_keyword;

public class lab150 {
    public static void main(String[] args) {
        System.out.println(demo.clg_name);
        demo.printname();
        demo d1=new demo();
        System.out.println(d1.version);
        d1.printname2();
        demo.clg_name="TTA ATB5x";
        demo.printname();
        d1.version=2023;
        d1.printname2();

        demo d2=new demo();
        d2.version=2021;
        d2.printname2();
    }
}
