package basics_class07_30_12_2023;

import java.util.Scanner;

public class lab125 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row of 2D array");
        int r= sc.nextInt();
        System.out.println("Enter the column of 2D array");
        int c= sc.nextInt();
        int [][]arr_2D=new int [r][c];
        System.out.println("Enter the 2D array elements");
        for(int i=0;i< arr_2D.length;i++)
        {
            for(int j=0;j<arr_2D[i].length;j++)
            {
                arr_2D[i][j]= sc.nextInt();
            }
        }
        for(int k=0;k<arr_2D.length;k++)
        {
            for (int l=0;l<arr_2D[k].length;l++)
            {
                if (k==l)
                {
                    System.out.print(arr_2D[k][l]+"\t");
                }
                else
                {
                    arr_2D[k][l]=0;
                    System.out.print(arr_2D[k][l]+"\t");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
