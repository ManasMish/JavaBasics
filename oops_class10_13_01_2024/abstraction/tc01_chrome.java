package oops_class10_13_01_2024.abstraction;

public class tc01_chrome extends baseclass{

    @Override
    String openbrowser() {
        System.out.println("Starting chrome");
        return null;
    }

    @Override
    String closebrowser() {
        System.out.println("Closing chrome");
        return null;
    }
}
