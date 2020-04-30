package Lesson_2_Decomposition;

// Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
// которое меньше максимального элемента массива, но больше всех других элементов).

public class Ex_5 {

    public static int[] SortArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int indexMax = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexMax]) {
                    indexMax = j;
                }
            }
            if (i != indexMax) {
                int temp = arr[indexMax];
                arr[indexMax] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    public static int PreviosMax(int[] arr) { // Нахождение числа меньше максимального, но больше остальных чисел.
        int max = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            if (max > arr[i]) {
                return arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{343,343,2321,324,5456,323,55};
        System.out.println(PreviosMax(SortArr(arr)));
    }
}