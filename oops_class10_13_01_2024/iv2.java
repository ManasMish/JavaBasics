package oops_class10_13_01_2024;

public class iv2 {
    public static void main(String[] args) {
        person02 p1=new person02();
        person02 p2=new person02();
        person02 p3=null;
       // p3.run();
        p2.run();
        p1.run();
    }
}
class person02{
    int a;
    void run()
    {
        System.out.println("Run called");
    }
}
