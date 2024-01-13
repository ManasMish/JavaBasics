package oops_class10_13_01_2024;

public class IV1 {
    public static void main(String[] args) {
        person h=new person();
        System.out.println(h.a);
        person h1=new person(23);
        System.out.println(h1.a);
        person h2=new person(23,true);
        System.out.println(h2.a);
        System.out.println(h2.b);
        System.out.println(h.b);
        h.a=99;
        System.out.println(h.a);

    }
}
class person
{
    int a;
    boolean b;
    person()
    {
        this.a=10;
    }
    person(int b)
    {
        this.a=b;
    }
    person(int b,boolean a)
    {
        this.a=b;
        this.b=a;
    }
}
