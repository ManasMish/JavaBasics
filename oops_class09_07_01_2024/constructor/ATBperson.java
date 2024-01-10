package oops_class09_07_01_2024.constructor;

public class ATBperson {
    String name;
    long ph_num;
    String email;
    boolean married;
    String course;
    ATBperson() // Default constructor
    {
        course="ATB5x";
        System.out.println("Inside default constructor");
    }
    ATBperson(String name_frm_obj_ref) // Parameterized constructor
    {
        this.name=name_frm_obj_ref;
    }
    void talk()
    {
        System.out.println("Let's TALK!!");
    }
    void print_details()
    {
        System.out.println(course);
        System.out.println(name);
        System.out.println(this.name);
    }
}
