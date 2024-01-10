package oops_class09_07_01_2024.constructor;

import java.util.Scanner;

public class lab145 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String in_name= sc.next();
        person p1=new person(in_name);
        p1.printdetails();
        System.out.println("enter the second name");
        String in_name2= sc.next();
        person p2=new person(in_name2,0,0);
        p2.printdetails();
    }
}
