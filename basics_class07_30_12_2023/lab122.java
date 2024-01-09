package basics_class07_30_12_2023;

import java.util.Scanner;

public class lab122 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a to interchange with b");
        int a=sc.nextInt();
        System.out.println("Enter value of b to interchange with a");
        int b= sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Interchanged value of a is : "+a);
        System.out.println("Interchanged value of b is : "+b);
    }
}
