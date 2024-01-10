package oops_class09_07_01_2024.constructor;

public class bnkAcc {
    String bnk_name;
    int bal;
    String code;
    bnkAcc()
    {
        System.out.println("Inside default constructor");
        bnk_name="SBI";
        bal=500000;
        code="SBIN00048";
    }
    bnkAcc(String bnk_name,int bal,String code)
    {
        this.bnk_name=bnk_name;
        this.bal=bal;
        this.code=code;
    }
    void printbnkdetails()
    {
        System.out.println("Bank Name --> "+this.bnk_name);
        System.out.println("Account Balance --> "+this.bal);
        System.out.println("Bank IFSC code --> "+this.code);
    }
}