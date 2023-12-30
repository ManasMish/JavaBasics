package BasicPracticeProblems;

import java.util.Scanner;

public class chngvlu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers to interchange their value");
        int a= sc.nextInt();
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value of a\t"+a);
        System.out.println("Value of b\t"+b);
    }
}
