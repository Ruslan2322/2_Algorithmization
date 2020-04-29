package Lesson_02_Sorting;

// Cортировка выбором. Дана последовательность чисел a1<=a2<=a3<= ...<=aN .Требуется переставить элементы так,
// чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
// элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
// повторяется. Написать алгоритм сортировки выбором.

public class Ex_3 {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 45, 11, 22, 34, 6, 7, 8, 9, 25, 2, 3, 65, 87, 21};

        for (int i = 0; i < arr.length - 1; i++) {
            int count = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[count] < arr[j]) {
                    count = j;
                }
            }

            int T = arr[count];
            arr[count] = arr[i];
            arr[i] = T;
        }
        for (int quant : arr)
            System.out.print(quant + " ");
    }
}