package oops_class08_06_01_2024.basics;

public class lab134 {
    public static void main(String[] args) {
        String pass="name1234";
        // Immutable in nature (that can't changed)


        // 1000 times I am going to change the password value
        // should I use the Sb, sb OR String

        // Mutable - that can be changed!!

        StringBuilder pass2=new StringBuilder("pass1234");
        pass2.append("567");
        System.out.println(pass2);
        pass2.append("890");
        System.out.println(pass2);

        // String, (new) -> concat
        // StringBuffer, Stringbuildet - append
    }
}
