package oops_class11_14_01_2024.interview;

public class abstract01 {
}
abstract class person1{
    abstract void say();
    abstract void say2();
    void eat()
    {
        System.out.println("Inside eat method pf person1 class");
    }
}
abstract class student1 extends person1{
    abstract void m2();
    abstract void m3();
}
class manas extends student1{

    @Override
    void say() {

    }

    @Override
    void say2() {

    }

    @Override
    void m2() {

    }

    @Override
    void m3() {

    }
}
