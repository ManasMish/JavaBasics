package oops_class11_14_01_2024.exception;

public class lab163 {
    public static void main(String[] args) {
        String sh=args[0];
        int x=Integer.parseInt(sh);
        int a=10/x;
        System.out.println(x);
        System.out.println(a);
    }
}
//JVM will be Initialized
//Creates and Starts the main Thread.


//main Thread will do the following tasks
//1)Collects the Command Line Arguments
//2)Creates the String array with CLA
//3)Calls main method by passing String array as Parameter:
//Lab163.main(5,15);
//Now Control will be transfered from main Thread to main method

//Control will come back to main thread in two ways.
//A)When problem comes in main -> JVM
// Creates the Object of Identified Exception class.
//Excetpion a=new Excetpion()
