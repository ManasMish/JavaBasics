package BasicPracticeProblems;

import java.util.Scanner;

public class prime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether prime or not");
        int p = sc.nextInt();
        int flag = 0;
        if (p == 0 || p == 1)
        {
            System.out.println("Entered number\t" + p + " is not prime");
        }
        else
        {
            for (int i = 2; i <=p ;i++) {
                if(p%i==0)
                {
                    flag=1;
                    break;
                }
                else {
                    System.out.println("Entered number\t"+p+" is prime");
                    break;
                }
            }
            if(flag==1) {
                System.out.println("Entered number\t" + p + " is not prime");
            }
        }
    }
}
