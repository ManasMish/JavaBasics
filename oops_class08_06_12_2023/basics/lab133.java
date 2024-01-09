package oops_class08_06_12_2023.basics;

public class lab133 {
    public static void main(String[] args) {
       /*1*/ String name="Manas";     //immutable

       /*2*/  String name2=new String("Manas");  //immutable

        /*3*/ StringBuilder name3=new StringBuilder("Manas");  //mutable
        name3.append(" Mishra");
        System.out.println(name3);

        /*4*/ StringBuffer name4=new StringBuffer("South");     //mutable
        name4.append(" East");
        System.out.println(name4);
    }
}
