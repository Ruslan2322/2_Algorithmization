package Lesson02_Arrays_of_arrays;

// Задана матрица неотрицательных чисел. Посчитать сумму элементовв каждом столбце.
// Определить, какой столбец содержит максимальную сумму.

public class Ex_9 {

    public static void main(String[] args) {
       int n = 10;
       int C = 0;
       int SUM;
       int xSUM = 0;
       int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int j = 0; j < arr[0].length; j++) {
            SUM = 0;
            for (int i = 0; i < arr.length; i++) {
                SUM += arr[i][j];

            }
            if (xSUM < SUM) {
                xSUM = SUM;
                C = j + 1;

            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Сумма = " + xSUM + " Столбец с макс. суммой = " + C);
    }
}