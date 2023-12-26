package BasicPracticeProblems;

import java.util.Scanner;

public class VowConsoCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to count number of vowels and consonents");
        String c= sc.next();
        c=c.toLowerCase();
        int v;
        int con;
        for(int i=0;i<c.length();i++)
        {
            char f=c.charAt(i);
            System.out.println(f);
        }
        sc.close();
    }
}
