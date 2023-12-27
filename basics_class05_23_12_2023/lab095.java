package basics_class05_23_12_2023;

import java.util.Scanner;

public class lab095 {
    public static void main(String[] args) {
        // Sum of Digit = 5+4+3+2+1


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        long sum = 0;
        // 5  -> i = 1 to 5 ->  fact = fact * i , i++
        // A -> int i = 1;
        // B -> i <=number or i < =5
        // C -> i++
        // D -> fact = fact+i

//        int i=1;
//        while(i<=number){
//            fact = fact*i;
//            i++;
//        }
//        System.out.println("Fact -> "+ fact);


        for (int j = 1; j <= number ; j++) {
            sum = sum+j;
        }

        System.out.println("sum of numbers -> "+ sum);


        sc.close();

    }
}
