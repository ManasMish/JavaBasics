package basics_class05_23_12_2023;

public class lab087 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Val Even of ->" + i);
                continue;
            }
            System.out.println("Val Odd of -> " + i);

        }
    }
}
