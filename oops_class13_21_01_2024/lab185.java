package oops_class13_21_01_2024;

import java.util.Enumeration;
import java.util.Vector;

public class lab185 {
    public static void main(String[] args) {
        Vector<String> v2 = new Vector<>();
        v2.add("Manas");
        v2.add("67");
        v2.add("true");
        Enumeration e = v2.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
