package basics_class07_30_12_2023;

import java.util.Scanner;

public class lab124 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int arr_len=sc.nextInt();
        int []arr=new int[arr_len];
        System.out.println("Enter the array elements");
        for(int i=0;i<arr_len;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Entered array elements are : ");
        for(int j=0;j<arr_len;j++)
        {
            System.out.println(arr[j]);
        }
        sc.close();
    }
}
