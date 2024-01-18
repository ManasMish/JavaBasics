package oops_class11_14_01_2024.inner_class;

public class lab155 {
    public static void main(String[] args) {
        student s1=new student() { // Anonymous class 
            @Override
            public void setId() {

            }
        };
        s1.setId();
        B b1=new B() { // Anonymous class

            };

    }
}
abstract class B{
    int var_b=12;
}
interface student{
    int id=11;
    void setId();
}
