package OOPs_class07_30_12_2023;

import static java.lang.Integer.sum;

public class lab112 {
    public static void main(String[] args) {
        int s=sum(3,4);
        int r=singleinput(0);
        int t=noinput();
        int j=tripleinput(7,8,9);
        print();
        System.out.println("sum of two number is : "+s);
        System.out.println("Single input : "+ r);
        System.out.println("No input : "+t);
        System.out.println("sum of three numbers : "+j);
    }
        static int sum(int input_1,int input_2)
        {
            return input_1+input_2;
        }
        static int singleinput(int input_1)
        {
            return input_1;
        }
        static int noinput()
        {
            return 99;
        }
        static int tripleinput(int m,int p,int c)
        {
            return m+p+c;
        }
        static void print()
        {
            System.out.println("Hi");
        }
}
