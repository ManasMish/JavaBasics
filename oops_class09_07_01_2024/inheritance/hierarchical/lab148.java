package oops_class09_07_01_2024.inheritance.hierarchical;

public class lab148 {
    public static void main(String[] args) {
        car c= new car();
        c.vehiclehastopspeed();

        System.out.println("----------------");

        truck t=new truck();
        t.vehiclehastopspeed();

        System.out.println("----------------");

        vehicle v=new vehicle();
        v.vehiclehastopspeed();

        System.out.println("----------------");

        vehicle v1=new car();
        v1.vehiclehastopspeed();

        System.out.println("----------------");

        vehicle v2=new truck();
        v2.vehiclehastopspeed();

        System.out.println("----------------");

//        car c1=new vehicle();
//        truck t1=new vehicle();
//        car c2=new truck();
//        truck t2=new car();

    }
}
