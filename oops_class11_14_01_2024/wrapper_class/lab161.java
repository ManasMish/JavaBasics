package oops_class11_14_01_2024.wrapper_class;

public class lab161 {
    public static void main(String[] args) {
        int a=10;
        Integer a2=Integer.valueOf(a);
        // wrapper class we use in collection framework

        // Collection Framework --> Class --> hate primitive data type
        // You have to use wrapper class in collection.

        Character ch='a';
        // unboxing -- Character object to primitive conversion
        char b=ch;

        System.out.println(Integer.valueOf(55));
        System.out.println(Integer.max(34,89));
        System.out.println(Integer.min(-9,-18));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

       double d=79.35;
       String s1=String.valueOf(d);
//       Double s2= d;
       Double s2=Double.valueOf(d);
       Integer a22=s2.intValue();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(a22);

    }
}
