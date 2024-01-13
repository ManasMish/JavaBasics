package oops_class10_13_01_2024.encapsulation;

public class badeg {
    public static void main(String[] args) {
        vwologin v1=new vwologin("admin","admin");
        boolean c1=v1.isloggedin("amz","@1234");
        v1.setUserid("mnb");
        System.out.println(v1.getPassword());
        boolean c2= v1.isloggedin("admin","admin");
        System.out.println(c2);
    }
}

