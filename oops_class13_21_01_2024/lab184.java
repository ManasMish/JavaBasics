package oops_class13_21_01_2024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class lab184 {
    public static void main(String[] args) {
        List course=new ArrayList();
        course.add("ATB");
        course.add("ATB5x");
        course.add("Blueprint");
        course.add("Automation Tester");

        Iterator i1= course.iterator();
        while (i1.hasNext()){
//            course.add("hello");
            System.out.println(i1.next());
        }
        System.out.println("---------------------");

        ListIterator i2= course.listIterator(course.size());
        while (i2.hasPrevious()){
//            course.add("AI");
//            i2.add("Hello");
            System.out.println(i2.previous());
        }
    }
}
