package oops_class09_07_01_2024.inheritance.multilevel;

public class lab149 {
    public static void main(String[] args) {
        grandfather g=new grandfather();
        g.bhk();
        System.out.println("----------------");
        father f=new father();
        f.bhk();
        f.bhkf();
        System.out.println("----------------");
        son s=new son();
        s.bhk();
        s.bhkf();
        s.bhks();
        System.out.println("----------------");
        grandfather g1=new father();
        g1.bhk();
        System.out.println("----------------");
//        g1.bhkf();
        grandfather g2=new son();
        g2.bhk();
        System.out.println("----------------");
        father f1=new son();
        f1.bhk();
        f1.bhkf();
        System.out.println("----------------");
//        f1.bhks();
//        son s1=new grandfather();
//        son s2=new father();
//        father f2=new grandfather();
    }
}
