package basics_class07_30_12_2023;

import java.util.Scanner;

public class lab123 {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value of a to interchange");
            int a= sc.nextInt();
            System.out.println("Enter the value of b to interchange");
            int b= sc.nextInt();
            a=a*b;
            b=a/b;
            a=a/b;
            System.out.println("Interchanged value of a is : "+a);
            System.out.println("Interchanged value of b is : "+b);
        }
        catch (Exception e)
        {
            System.out.println("Not possible for zero");
        }
    }
}
