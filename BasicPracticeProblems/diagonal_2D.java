package BasicPracticeProblems;

import java.util.Scanner;

public class diagonal_2D {
    public static void main(String[] args) {
        int [][]m=new int[3][4];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of array");
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[i].length;j++)
            {
                m[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[i].length;j++)
            {
                if(i==j)
                {
                    System.out.print(m[i][j]+"\t");
                }
                else
                {
                    System.out.print(0+"\t");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
