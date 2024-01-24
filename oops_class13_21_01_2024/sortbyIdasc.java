package oops_class13_21_01_2024;

import java.util.Comparator;

public class sortbyIdasc implements Comparator<Student> {
    @Override
    public int compare(Student student, Student t1) {
        return Integer.compare(student.getId(), t1.getId());
    }
}
