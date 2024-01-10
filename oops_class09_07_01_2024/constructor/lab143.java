package oops_class09_07_01_2024.constructor;

public class lab143 {
    public static void main(String[] args) {
        ATBperson p1=new ATBperson(); // Default constructor
        p1.name="Manas";
        p1.print_details();

        ATBperson p2=new ATBperson("Mishra"); // Parametrized constructor
        p2.course="ATB%XX";
        p2.print_details();

//        String s; // Local Variable default value is never assigned by JVM
//        System.out.println(s);

        // constructor
        // constructor is used to construct the object of a class.
        // name must be exactly the same as class
        // constructor is a special method.
        // it does not have a return type

    }
}
