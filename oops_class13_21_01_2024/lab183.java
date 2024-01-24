package oops_class13_21_01_2024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lab183 {
    public static void main(String[] args) {
        List<String> l1=new ArrayList<>();
        l1.add("manas");
        l1.add("mishra");
        l1.add("133");
        l1.add("ATB5x");

        List numlist=new ArrayList<>();
        numlist.add(11);
        numlist.add(12);
        numlist.add(13);
        numlist.add("Manas");

        System.out.println(l1);

        l1.addAll(numlist);
        System.out.println(l1);

        Iterator i1=numlist.iterator();
        while (i1.hasNext()){
            System.out.println(i1.next());
        }
    }
}