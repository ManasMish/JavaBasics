package oops_class11_14_01_2024.inner_class;

public class lab153 {
    public static void main(String[] args) {
        OOC o1=new OOC();
        OOC.SNCI sn1=new OOC.SNCI();
        sn1.show();
    }

}
class OOC
{
    static int o=100;
    int a=900;
     static class SNCI
    {
        void show()
        {
            System.out.println(o);
           // System.out.println(a);
        }
    }
}
