package BasicPracticeProblems;

import java.util.Scanner;

public class gradecal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks to print the grade");
        int marks= sc.nextInt();
        if(marks>89 && marks<=100)
        {
            System.out.println("A");
        }
        else if(marks>79 && marks<=89)
        {
            System.out.println("B");
        }
        else if(marks>69 && marks<=79)
        {
            System.out.println("C");
        }
        else if(marks>59 && marks<=69)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("FAIL");
        }
        sc.close();

    }
}

