package oops_class10_13_01_2024.encapsulation;

public class lab147 {
    public static void main(String[] args) {
        student s1=new student();
        s1.name="Amit";
        s1.name=" Pramod";
        s1.print();

        persons p1=new persons();
        p1.id=1;
        p1.id=99;
        p1.id=-1;
        p1.bal=999;
        System.out.println(p1.bal);
        System.out.println(p1.sum(5,7));
    }
}
