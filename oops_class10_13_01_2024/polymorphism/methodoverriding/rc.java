package oops_class10_13_01_2024.polymorphism.methodoverriding;

public class rc {
    public static void main(String[] args) {
        dog d=new dog();
        d.bark();
        hound h=new hound();
        h.bark();
        dog d2=new hound();// Dynamic Diaptch
        d2.bark();// Runtime Polymorphism
        //hound h2=new dog();
    }
}
