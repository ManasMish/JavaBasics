package oops_class12_20_01_2024;

import java.util.List;

public class lab178 {
    public static void main(String[] args) {
        List L1 = List.of("Mango", "Apple", 1, 2.0, true);
        List L2 = List.of(1, 2, 3, 4);
        List L3 = List.of("Mango", "Apple", "FRog");
        System.out.println(L1.get(0));
        System.out.println(L1.get(4));
        System.out.println(L1.size());
//        L1.add(66);
//        L1.remove("Mango");
        System.out.println(L1);
        System.out.println(L1.indexOf("Apple"));
        System.out.println(L1.indexOf(true));
        System.out.println(L1.indexOf(false));
        System.out.println(L1.isEmpty());
//       L1.add("pramod");
    }
}
