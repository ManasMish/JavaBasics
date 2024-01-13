package oops_class10_13_01_2024.encapsulation;

public class icicibnk {

    icicibnk(String name,long bal)
    {
        this.name=name;
        this.bal=bal;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public long getBal() {
        return bal;
    }
    public void setBal(long bal)
    {
        if (bal>0)
        {
            this.bal=bal;
        }
        else
        {
            System.out.println("Not allowed");
        }
    }
    void print()
    {
        System.out.println(this.name);
        System.out.println(this.bal);
    }

    long bal;
}
