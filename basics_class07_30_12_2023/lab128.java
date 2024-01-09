package basics_class07_30_12_2023;

import java.util.Scanner;

public class lab128 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word to reverse");
        String name= sc.next();
        char [] arr=name.toCharArray();
        int left=0;
        int right= name.length()-1;
        while(left<right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String rev_name=new String(arr);
        System.out.println(rev_name);
    }
}
