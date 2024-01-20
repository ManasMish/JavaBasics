package oops_class12_20_01_2024;

public class lab174 {
    public static void main(String[] args) throws CustomException {
        bank b1=new bank("USD",200);
        bank b2=new bank("INR",200);
        System.out.println(b1.add(b2));
    }
}
