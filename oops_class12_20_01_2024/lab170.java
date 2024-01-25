package oops_class12_20_01_2024;

public class lab170 {
    public static void main(String[] args) {
        extracted(10);
        extracted(0);
    }

    private static void extracted(int b) {
        if(b==0){
            throw new ArithmeticException("B cann't be zero");
        }
        else {
            int a = 10 / b;
            System.out.println(a);
        }
    }
}
