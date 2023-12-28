package BasicPracticeProblems;

import java.util.Scanner;

public class palindromstr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to check whether palindrome or not");
        String input=sc.next();
        String rev="";
        for(int i=(input.length()-1);i>=0;i--)
        {
            rev=rev+input.charAt(i);
        }
        if(input.equalsIgnoreCase(rev))
        {
            System.out.println("Entered string "+input+" is palindrome");
            System.out.println(rev);
        }
        else {
            System.out.println("Entered string "+input+" is not palindrome");
            System.out.println(rev);
        }
    }
}
