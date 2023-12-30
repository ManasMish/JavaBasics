package OOPs_class07_30_12_2023;

public class lab113 {
    public static void main(String[] args) {
        double d=Math.pow(23.56,2.22);
        System.out.println("23.56 to the power 2.22 is : "+d);

        //OOPs - accessModifier (Private, public and protected)

        // What a Function
        // Function can do some Task.
        // How to create a Function?
        // 1. Definition
        // 2. Call the function
        // Function vs Method(is different OOPs or class)

        sayHello4times();
        sayHello4times();

    }
    //    accessModifier returnType methodName(parameterList) {
//         method body
//    }
    static void sayHello4times()// Definition
    {
        for(int i=1;i<=4;i++)
        {
            System.out.println("Hello");
        }
        System.out.println("------------");
    }
}
