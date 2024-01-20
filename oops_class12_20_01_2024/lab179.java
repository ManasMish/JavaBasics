package oops_class12_20_01_2024;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class lab179 {
    public static void main(String[] args) {
//        List m1=new List();
        List my=new ArrayList();
        my.add("hello");
        my.add(1);
        my.add(33.33);
        my.add(true);
        my.add(true);
        System.out.println(my);
        my.set(0,"hi");
        System.out.println(my);
        my.remove(0);
        System.out.println(my);
        for(int i=0;i< my.size();i++)
        {
            System.out.println(my.get(i));
        }
        for(Object o:my){
            System.out.println(o);
        }
    }
}
