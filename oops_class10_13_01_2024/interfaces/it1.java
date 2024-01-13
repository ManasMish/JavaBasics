package oops_class10_13_01_2024.interfaces;

public class it1 {
    public static void main(String[] args) {
        hello h=new hello();
        h.hello();
        h.say();
        it i=new hello();
        i.say();
        i.hello();

    }
}
interface it{
    void say();
    default void hello()
    {
        System.out.println("Hello default");
    }
}
interface p{}
class hello implements it{


    @Override
    public void say() {

    }

    @Override
    public void hello() {
        it.super.hello();
    }
}
