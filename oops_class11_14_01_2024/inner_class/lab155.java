package oops_class11_14_01_2024.inner_class;

public class lab155 {
    public static void main(String[] args) {
        Student s1= new Student() {
            @Override
            public void setId() {

            }
        };
        }
}
abstract class B
{
    int var_b=12;
}
interface Student
{
    int id=11;
    void setId();
}
class noname implements Student
{

    @Override
    public void setId() {

    }
}
