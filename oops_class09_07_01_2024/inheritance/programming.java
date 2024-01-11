package oops_class09_07_01_2024.inheritance;

public class programming {
    int version;
    String author;
    programming()
    {
        System.out.println("Inside DC");
    }
    programming(int version,String author)
    {
        this.version=version;
        this.author=author;
    }
    void printinfo()
    {
        System.out.println("Author is --> "+this.author);
        System.out.println("Version --> "+this.version);
    }
    void car()
    {
        System.out.println("RANGE ROVER");
    }
    void bhk3()
    {
        System.out.println("3BHK");
    }
}
