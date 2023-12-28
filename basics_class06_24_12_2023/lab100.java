package basics_class06_24_12_2023;

public class lab100 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};

        System.out.println(arr1==arr2);

        int[] arr3 = arr1;
        System.out.println(arr1==arr3);

        System.out.println(arr1.equals(arr2));
        // If String -> True Why - Values
        // Arrays -> Compare Don't -> Ref - Not equal

        arr3[0] = 24;
        System.out.println(arr1[0]);
        System.out.println(arr3[0]);
    }
}
