package Lesson_02_Sorting;

// Даны две неубывающих последовательности.
// Образовать новую последовательность чисел так, что бы она тоже была неубывающей

public class Ex_02 {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = new int[]{6, 7, 8, 9, 10};
        int[] arr = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, arr, 0, arr1.length);

        System.arraycopy(arr2, 0, arr, arr1.length, arr2.length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int T = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = T;
                }
            }
        }
        for (int quant : arr)
            System.out.print(quant+ " ");
    }
}