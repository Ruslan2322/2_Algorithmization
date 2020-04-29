package Lesson_02_Sorting;

// Заданы два одномерных массива с различным количеством элементов и натуральное число k.
// Объединить их в один массив, включив второй массив между k-м и (k+1) - м жлементами первого,
// при этом не используя дополнительный массив.

public class Ex_01 {

    public static void main(String[] args) {

            int[] arr1 = new int[]{1, 2, 3, 4, 5};
            int[] arr2 = new int[]{5, 5, 5, 9, 5, 6, 7, 6, 5, 4, 5};
            int k = 5;
            int[] arr = new int[arr1.length + arr2.length];
            System.arraycopy(arr1, 0, arr, 0, arr1.length);
            System.arraycopy(arr2, 0, arr, k, arr2.length);
            for (int quant : arr)
                System.out.print(quant + " ");
        }
    }