package oops_class10_13_01_2024.encapsulation;

public class lab148 {
    public static void main(String[] args) {
        vwologinfxd vf1=new vwologinfxd("Manas","@1234");
        boolean c1= vf1.isloggedin("Manas","@1234");

        vf1.setUsername("Mishra");
        boolean c2=vf1.isloggedin("Mishr","@1234");
        String u=vf1.getUsername();
        System.out.println(c1);
        System.out.println(u);
        System.out.println(c2);
    }
}
