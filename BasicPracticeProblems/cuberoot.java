package BasicPracticeProblems;

import java.util.Scanner;

public class cuberoot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of variable x");
        int x=sc.nextInt();
        System.out.println("Enter the value of variable y");
        int y=sc.nextInt();
        System.out.println("Enter the value of variable z");
        int z=sc.nextInt();
        double croot=Math.cbrt(((Math.pow(x,2))+(Math.pow(y,2))-(Math.abs(z))));
        System.out.println(croot);
        sc.close();
    }
}
