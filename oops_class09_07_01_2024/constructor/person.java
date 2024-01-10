package oops_class09_07_01_2024.constructor;

public class person {
    String name;
    person()
    {
        System.out.println("inside default");
    }
    person(String name)
    {
        this.name=name;
    }
    person(String name,int age,int rollnum)
    {
        this.name=name;
    }
    void printdetails()
    {
        System.out.println(this.name);
    }
}
