package Lesson02_Arrays_of_arrays;

//Сформировать квадратную матрицу порядка n по заданному образцу (n-четное).

public class Ex_4 {

    public static void main(String[] args) {
        int n = 6;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0)
                    arr[i][j] = n - j;
                else
                    arr[i][j] = j + 1;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}