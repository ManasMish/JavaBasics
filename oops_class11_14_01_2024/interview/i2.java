package oops_class11_14_01_2024.interview;

public class i2 {
    public static void main(String[] args) {
        System.out.println(pp.a);
        pp f=new foo();
        rofl f1=new foo();
        foo f2=new foo();
        f.pp1();
        f1.say();

    }
}
interface pp{
    int a=79;
    void pp1();
}
abstract class rofl implements pp{
    abstract void say();
}
class foo extends rofl{

    @Override
    public void pp1() {
        System.out.println("pp1");
    }

    @Override
    void say() {
        System.out.println("say");
    }
}