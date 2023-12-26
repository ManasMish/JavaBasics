package BasicPracticeProblems;

import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Principal Amount");
        int p=sc.nextInt();
        System.out.println("Enter the rate %");
        double r= sc.nextDouble();
        System.out.println("Enter the period in years");
        double t=sc.nextDouble();
        double amount=0;
        double interest=0;
        interest=p*((r/100)*t);
        System.out.println("Simple interest for period "+t+"years at "+r+"% is: "+interest);
        amount=p+interest;
        System.out.println("Final Amount is: "+amount);
        sc.close();
    }
}
