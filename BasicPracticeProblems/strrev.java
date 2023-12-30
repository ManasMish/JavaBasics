package BasicPracticeProblems;

import java.util.Scanner;

public class strrev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string which is to be reversed");
        String st= sc.next();
        char m[]=st.toCharArray();
        int left=0;
        int right=m.length-1;
        char dup;
        while(left<right)
        {
            dup=m[right];
            m[right]=m[left];
            m[left]=dup;
            left=left+1;
            right=right-1;
        }
       String p=new String(m);
        System.out.println(p);
        sc.close();
    }
}
