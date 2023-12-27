package basics_class05_23_12_2023;

public class lab085 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { // 10 Times, i -> 0 to 9
            System.out.println(i);
            if (i == 5) continue;

            System.out.println("**AFTER");
        }
    }
}
