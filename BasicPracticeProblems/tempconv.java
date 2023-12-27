package BasicPracticeProblems;

import java.util.Scanner;

public class tempconv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature");
        double t = sc.nextDouble();
        System.out.println("Enter the unit");
        String u=sc.next();
        if((int)u.charAt(0)==70||(int)u.charAt(0)==102)
        {
            t=(t-32)*5/9;
            System.out.println("Temperature in degree celsius is: "+t);
        } else if ((int)u.charAt(0)==67||(int)u.charAt(0)==99)
        {
          t=(t*9/5)+32;
            System.out.println("Temperature in degree fahrenheit is: "+t);
        }
        else
        {
            System.out.println("You have entered wrong unit");
        }
    }
}
