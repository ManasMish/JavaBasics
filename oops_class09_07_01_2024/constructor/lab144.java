package oops_class09_07_01_2024.constructor;

public class lab144 {
    public static void main(String[] args) {
        bnkAcc b1=new bnkAcc();
//        b1.bnk_name="PNB";
//        b1.bal=200000;
//        b1.code="PNBN0049";
        b1.printbnkdetails();

        System.out.println("Second bank details");

        bnkAcc b2=new bnkAcc("Citi",400000,"CITI0007");
        b2.printbnkdetails();
    }
}
