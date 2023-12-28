package basics_class06_24_12_2023;

public class lab101 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};

        System.out.println("Length ->" + arr1.length);

        System.out.println("Ref Address -> "+arr1);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        for (int i = 0; i <= arr1.length-1; i++) {
            System.out.println(arr1[i]);
        }


    }
}
