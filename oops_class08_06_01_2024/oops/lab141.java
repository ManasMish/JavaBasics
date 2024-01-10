package oops_class08_06_01_2024.oops;

public class lab141 {
    public static void main(String[] args) {

        // Person - class blueprint
        // p - ref variable
        // new Person() - Object Real
        // OOPs concept

        person p1=new person();
        p1.name="Manas";
        System.out.println(p1.name);
        System.out.println(p1.add);
        System.out.println(p1.ph_num);
        System.out.println(p1.email_id);
        p1.sleep();
        if(p1.isMarried())
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }

        person p2=new person();
        p2.name="Mishra";
        System.out.println(p2.name);
        System.out.println(p1.name);

        new person(); // new object // person(); --> is method or function
        person p3=null;
        System.out.println("End of program");
        //p1,p2,p3 are reference
    }
}
