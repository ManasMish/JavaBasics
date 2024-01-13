package oops_class10_13_01_2024.accessmodifiers.police;

public class cop {
    public int gun;
    private int bomb;

    public cop(int gun)
    {
        this.gun=gun;
    }
    protected void canishoot()
    {
        System.out.println("Yes you can!!");
    }
}
