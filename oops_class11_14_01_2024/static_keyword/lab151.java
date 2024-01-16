package oops_class11_14_01_2024.static_keyword;

public class lab151 {
    public static void main(String[] args) {
        p01 p1=new p01();
        p01 p2=new p01();
        p1.m1();
      //  p1.m2();
        p01.m2();
        p01 p3=null;
        //p3.m1();
        p3.m2();
//        p01 p4=null;
//        p4.m2();
    }
}
class p01
{

    static
    {
        System.out.println("Inside static block");
    }
    {
        System.out.println("Inside Instance initialization block");
    }
    int a=10;
    static int b=20;
    void m1()
    {
        System.out.println("Inside m1 method");
        System.out.println(a);
        System.out.println(b);
    }
    static void m2()
    {
       // System.out.println(a);
        System.out.println("Inside m2 method");
        System.out.println(b);
    }
}
