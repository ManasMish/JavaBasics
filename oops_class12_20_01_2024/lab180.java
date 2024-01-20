package oops_class12_20_01_2024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lab180 {
    public static void main(String[] args) {
        List<String> m1=new ArrayList<>();
        m1.add("Manas");
        m1.add("is");
        m1.add("champion");
        System.out.println(m1);
        m1.set(0,"Mishra");
        System.out.println(m1);
        m1.add("!!");
        System.out.println(m1);
        m1.remove(3);
        System.out.println(m1);

        System.out.println("---------------");

        for(int i=0;i<m1.size();i++){
            System.out.println(m1.get(i));
        }

        System.out.println("---------------");

        for(String o: m1){
            System.out.println(o);
        }

        System.out.println("---------------");

        Iterator i1=m1.iterator();
        while (i1.hasNext()){
            System.out.println(i1.next());
        }

    }
}
