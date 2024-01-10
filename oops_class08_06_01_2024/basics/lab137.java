package oops_class08_06_01_2024.basics;

import java.util.Scanner;

public class lab137 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to check whether it's Palindrome or not");
        String in= sc.next();
        boolean result=isPalindrome(in);
        if(result)
        {
            System.out.println("Entered string is Palindromne");
        }
        else
        {
            System.out.println("Entered string is not palindrome");
        }
    }
    static boolean isPalindrome(String user_in)
    {
        String original_in=user_in;
        StringBuilder reverse_in=new StringBuilder(original_in);
        String after_rev_in=reverse_in.reverse().toString();
        return (after_rev_in.equalsIgnoreCase(original_in));
    }
}
