package BasicPracticeProblems;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check whether palindrome or not");
        int n= sc.nextInt();
        int dup=n;
        int r;
        int sum=0;
        while(n>0)
        {
            r=n%10;
           sum=sum*10+r;
           n=n/10;
        }
        if(sum==dup)
        {
            System.out.println("Entered number: " + dup +" is palindrome");
        }
        else
        {
            System.out.println("Entered number: " + dup +" is not palindrome");
        }
        sc.close();
    }
}
