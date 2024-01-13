package oops_class10_13_01_2024.interfaces;

public class lab149 {
    public static void main(String[] args) {

    }
}
interface it3{}
interface it4{}
class A{}
class B{}
abstract class C{}
abstract class D{}
class Test1 extends A{ }
//class Test2 extends A,B{ }
class Test3 implements it3{ }
class Test4 implements it3,it4{ }
class Test5 extends A implements it3,it4{ }
//class Test6 implements it3,it4 extends A{}
//interface it3 extends A{}
//interface it4 implements A{}
//interface it5 extends A,B{}
interface it6 extends it3,it4{}
abstract class m implements it3{}
abstract class n extends A{}