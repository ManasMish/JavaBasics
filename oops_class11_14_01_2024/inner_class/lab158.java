package oops_class11_14_01_2024.inner_class;

public class lab158 {
    public static void main(String[] args) {
        parent p=new parent();
        child c=new child();
        p=c;// Upcasting in class
       // c=p;
        hello h1=new hello();
        hello h2=new child2(); // Upcasting in class
       child2 c1= (child2) h2; // Downcasting in class
         child2 c2= (child2) h1; // Downcasting in class

    }
}
class hello{}
class child2 extends hello{}
class parent{}
class child extends parent{}
