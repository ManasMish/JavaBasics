package oops_class13_21_01_2024;

public class Student implements Comparable<Student> {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Integer id;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(String name, Integer id) {
        this.id = id;
        this.name = name;
    }

    @Override
//    public int compareTo( Student o) {
//        return (Integer.compare(this.id,o.id));
//    }
    public int compareTo(Student o) {
        return (CharSequence.compare(this.name, o.name));
    }
}
