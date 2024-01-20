package oops_class12_20_01_2024;

public class lab171 {
    public static void main(String[] args) throws Exception {
        readfile("C://pramod.txt");  // --> checked exception
    }
    static void readfile(String filename) throws Exception {
        int a=10/10;
        int c=0;
        int a1= 10/4;
        if(c==0)
        {
            throw new ArithmeticException();
        }
        else
        {
            int a2=10/c; // --> unchecked exception
        }
        int a3=10/1;
        int a4=10/10;
    }
}
