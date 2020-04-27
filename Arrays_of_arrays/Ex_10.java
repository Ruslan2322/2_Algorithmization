package Lesson02_Arrays_of_arrays;

// Найти положительные элементы главной диагонали квадратной матрицы.

public class Ex_10 {

    public static void main(String[] args) {

        int n = 10;
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j && arr[i][j] > 0) {
                    System.out.print(arr[i][j] + "\t");
                }
            }
        }System.out.println();
    }
}




