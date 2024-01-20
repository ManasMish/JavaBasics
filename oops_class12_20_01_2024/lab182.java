package oops_class12_20_01_2024;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class lab182 {
    public static void main(String[] args) {
        List<Integer> l3=new LinkedList();
        l3.add(4);
        l3.add(-3);
        System.out.println(l3);

        List<Double> d1=new LinkedList<>();
        d1.add(3.2);
        d1.add(0.0);
        d1.add(-8.99);
        System.out.println(d1);

        Iterator i3=l3.iterator();
        while (i3.hasNext()){
            System.out.println(i3.next());
        }

        Iterator i4=d1.iterator();
        while (i4.hasNext()){
            System.out.println(i4.next());
        }


    }
}
