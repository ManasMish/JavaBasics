package oops_class09_07_01_2024.inheritance;

public class java extends programming{
    String newfeature;
    java()
    {
        System.out.println("Inside java class dc");
    }
    java(String newfeature)
    {
        this.newfeature=newfeature;
    }
    void printinfojava()
    {
        System.out.println("New feature of Java --> "+this.newfeature);
    }
}
