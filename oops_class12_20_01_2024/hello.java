package oops_class12_20_01_2024;

public class hello {
    public static void main(String[] args) throws Exception {
        h h1=new h();
        h1.process();
    }
}
class h{
    public int process()throws Exception
    {
        int b=10/0;
        throw new NullPointerException();
    }
}
