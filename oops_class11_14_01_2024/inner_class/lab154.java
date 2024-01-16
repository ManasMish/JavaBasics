package oops_class11_14_01_2024.inner_class;

public class lab154 {
    public static void main(String[] args) {
//        manas m1=new manas();
//        m1.say();
        manas.opt o1=new manas.opt();
        o1.eat();
    }
}
class manas
{
    int age=27;
    void say()
    {
        System.out.println("I want to say something");
        System.out.println(age);
    }
    static class opt
    {
        void eat()
        {
            System.out.println("I am hungry!!!");
           // System.out.println(age);
        }
    }
}
