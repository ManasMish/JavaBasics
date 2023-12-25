package basicJ;

import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check sum of its digits");
        int n=sc.nextInt();
        int r;
        int sum=0;
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println("Sum of digits of entered number is : "+sum);
        sc.close();
    }
}
