package oops_class11_14_01_2024.inner_class;

public class lab152 {
    public static void main(String[] args) {
        car c = new car("range rover 2024");
        car.Engine e = c.new Engine("250HP");
        e.start();
        c.drive();
    }
}
class car
{
    String make;
   public car (String make)
    {
        this.make=make;
    }
    void drive()
    {
        System.out.println("You can drive!!");
    }
    public class Engine
    {
        String horse_power;
        public Engine(String horse_power)
        {
            this.horse_power=horse_power;
        }
        void start()
        {
            System.out.println("Engine is started --> "+make);
        }
    }
}
