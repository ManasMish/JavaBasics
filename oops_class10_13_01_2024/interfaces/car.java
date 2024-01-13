package oops_class10_13_01_2024.interfaces;

public class car implements engine,brake{
    void start()
    {
        System.out.println("Starting the car");
        engine();
        brake();
    }
    @Override
    public void brake() {
        System.out.println("Brake applied");

    }

    @Override
    public void engine() {
        System.out.println("Engine started");

    }
}
