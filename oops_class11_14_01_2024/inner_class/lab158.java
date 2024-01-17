package oops_class11_14_01_2024.inner_class;

public class lab158 {
    public static void main(String[] args) {
        parent p=new parent();
        child c=new child();
        p=c;
       // c=p;
        hello h1=new hello();
        hello h2=new child2();
        child2 c3= (child2) new hello();  //Downcasting of class
    }
}
class hello{}
class child2 extends hello{}
class parent{}
class child extends parent{}
