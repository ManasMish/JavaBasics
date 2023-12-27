package BasicPracticeProblems;

import java.util.Scanner;

public class VowConsoCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to count number of vowels and consonents");
        String c= sc.next();
        c=c.toUpperCase();
        int v = 0;
        int con = 0;
        for(int i=0;i<c.length();i++)
        {
            char f=c.charAt(i);
            if((int)f==65||(int)f==69||(int)f==73||(int)f==79||(int)f==85)
            {
                v=v+1;
            }
            else
            {
                con=con+1;
            }
        }
        System.out.println("Number of vowels in "+c+" is : "+v);
        System.out.println("Number of Consonants in "+c+" is : "+con);
        sc.close();
    }
}
