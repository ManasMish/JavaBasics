package oops_class09_07_01_2024.inheritance;

public class lab146 {
    public static void main(String[] args) {
        programming p1=new programming();
        p1.printinfo();
        p1.car();
        p1.bhk3();

        System.out.println("----------------");

        programming p2=new programming(123,"Who Know's");
        p2.printinfo();
        p2.car();
        p2.bhk3();

        System.out.println("----------------");

        java j1=new java();
        j1.bhk3();
        j1.car();

        System.out.println("----------------");

        java j2=new java("not aware");
        j2.printinfojava();

        System.out.println("----------------");

        programming p3=new java();
        //java j6=new programming();
        p3.bhk3();

        System.out.println("----------------");

        python py1=new python();
        py1.print();
        py1.bhk3();
        py1.printinfo();

        System.out.println("----------------");

    }
}
