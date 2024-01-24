package oops_class13_21_01_2024;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class lab187 {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.add(-789);
        arr.add(123);
        arr.add(89);
        arr.add(-90);
        Collections.sort(arr);
        System.out.println(arr);
    }
}
