package oops_class13_21_01_2024;

import java.util.Comparator;

public class sortbynameasc implements Comparator<Student> {

    @Override
    public int compare(Student student, Student t1) {
        return CharSequence.compare(student.getName(),t1.getName());
    }
}
