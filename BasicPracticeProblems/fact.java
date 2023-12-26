package BasicPracticeProblems;

import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        long fact=1;
        while(num!=0)
        {
            fact=fact*num;
            num=num-1;
            System.out.println(num);
        }
        System.out.println(fact);
        sc.close();
    }

}
