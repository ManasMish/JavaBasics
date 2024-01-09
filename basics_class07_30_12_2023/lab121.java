package basics_class07_30_12_2023;

import java.util.Scanner;

public class lab121 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a");
        int a=sc.nextInt();
        System.out.println("Enter value of b");
        int b= sc.nextInt();
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("Interchanged values of a & b are :");
        System.out.println("Value of a is : "+a);
        System.out.println("Value of b is : "+b);

    }
}
