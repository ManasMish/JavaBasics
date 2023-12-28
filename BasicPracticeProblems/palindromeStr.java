package BasicPracticeProblems;

import java.util.Scanner;

public class palindromeStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to check whether it is palindrome or not");
        String input= sc.next();
        input=input.toLowerCase();
        int count=0;
        for(int i=0;i<input.length();i++)
        {
            char f=input.charAt(i);
            char b=input.charAt(input.length()-1-i);
            if(f==b)
            {
                count=count+1;
            }
        }
        if(count==input.length())
        {
            System.out.println("Entered string "+input+" is Palindrome");
        }
        else
        {
            System.out.println("Entered string "+input+" is not Palindrome");
        }
        sc.close();
    }
}
