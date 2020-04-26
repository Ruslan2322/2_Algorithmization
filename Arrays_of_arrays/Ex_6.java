package Lesson02_Arrays_of_arrays;

//Сформировать квадратную матрицу порядка n по заданному образцу (n-четное).

public class Ex_6 {

    public static void main(String[] args) {
        int n = 10;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                for (int j = i; j < n - i; j++) {
                    arr[i][j] = 1;
                }
            } else {
                for (int j = n - i - 1; j <= i; j++) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}