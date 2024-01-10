package oops_class08_06_01_2024.basics;

public class lab131 {
    public static void main(String[] args) {
        String name="manas";
        System.out.println(name.concat(" mishra"));
        System.out.println(name+" mishra");
        System.out.println(name.contains("z"));
        System.out.println(name);
        String name2=new String("Manas");
        String act_res="manas";
        String exp_res="mishra";
        if(act_res.equalsIgnoreCase(exp_res))
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
