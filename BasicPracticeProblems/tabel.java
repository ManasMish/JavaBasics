package BasicPracticeProblems;

import java.util.Scanner;

public class tabel {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter th number to print its tabel upto 10 times");
            int n=sc.nextInt();
            for(int i=1;i<=10;i++)
            {
                System.out.println(n+"*"+i+"="+(n*i));
            }
            sc.close();
            }
}
