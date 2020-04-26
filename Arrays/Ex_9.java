package Lesson02_Arrays;


//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
// Если таких несколько, то определить наименьшее из них.

public class Ex_9 {

    public static void main(String[] args) {
        int[] arr = new int[50];
        int[] arrCo = new int[50];
        int count;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);

            }

        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
                }
            arrCo[i] = count;
            if (count > max)
                max = count;
        }
        count = 0;
        for (int i = 0; i < arrCo.length; i++) {
            if (max == arrCo[i])
                count++;
        }

        int[] arr1 = new int[count];
        count = 0;
        for (int i = 0; i < arrCo.length; i++) {
            if (arrCo[i] == max) {
                arr1[count] = arr[i];
                count++;
            }
        }
        int min = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < min)
                min = arr1[i];
        }
        System.out.println(min);

    }
}
