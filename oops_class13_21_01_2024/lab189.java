package oops_class13_21_01_2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lab189 {
    public static void main(String[] args) {
        Student s1=new Student("Manas",123);
        Student s2=new Student("Kumar",9606);
        Student s3=new Student("Mishra",1516);

        List<Student> detail=new ArrayList<>();
        detail.add(s1);
        detail.add(s2);
        detail.add(s3);
        System.out.println(detail);

        Collections.sort(detail);
        System.out.println(detail);

        Collections.sort(detail,new sortbyIdasc());
        System.out.println(detail);

        Collections.sort(detail,new sortbyiddec());
        System.out.println(detail);

        Collections.sort(detail,new sortbynameasc());
        System.out.println(detail);

        Collections.sort(detail,new sortbynamedec());
        System.out.println(detail);

    }
}
