package BasicPracticeProblems;

import java.util.Scanner;

public class prime2 {
    public static void main(String[] args) {
        int num=0;
        int half=0;
        int flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether prime or not");
        num = sc.nextInt();
        half=num/2;
        if (num == 0 || num == 1)
        {
            System.out.println("Entered number\t" + num + " is not prime");
            flag=1;
        }
        else {
            for (int i = 2; i <= half; i++) {
                if (num % i == 0) {
                    flag = 1;
                    System.out.println("Entered number\t" + num + "is not prime");
                    break;
                }
            }
        }
            if(flag==0) {
                System.out.println("Entered number\t" +num+ " is prime");
            }
        }
    }