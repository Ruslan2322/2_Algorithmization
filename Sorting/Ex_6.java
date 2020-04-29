package Lesson_02_Sorting;
import java.util.Arrays;


// Cортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить
// его по возрастанию. Делается это следующим образом: сравниваются два сосед-
// них элемента ai и a(i + 1). Если ai <= a(i + 1), то продвигаются на один
// элемент вперед. Если ai > a(i + 1), то производится перестановка и сдвигаю-
// тся на один элемент назад. Составить алгоритм этой сортировки.

public class Ex_6 {

    public static void main(String[] args) {

        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int T = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = T;
                i = i - 2;
            }
            if (i < 0)
                i = -1;

        }
        System.out.println(Arrays.toString(arr));
    }
}