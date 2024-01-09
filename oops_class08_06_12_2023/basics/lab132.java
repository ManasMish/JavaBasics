package oops_class08_06_12_2023.basics;

public class lab132 {
    public static void main(String[] args) {
        String s1="Manas";
        String s2="Manas";
        String s3=new String("Manas");
        String s4=new String("Manas");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s2));
        System.out.println(s3==s4);
    }
}
