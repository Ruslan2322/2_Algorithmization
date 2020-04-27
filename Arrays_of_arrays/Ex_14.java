package Lesson02_Arrays_of_arrays;

//Сформируйте случайную матрицу mxn, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.

public class Ex_14 {

    public static void main(String[] args) {
        int m = 20;
        int n = 20;
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                arr[i][j] = 1;
            }
        }
     if (arr.length >= arr[0].length) {
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 System.out.print(arr[i][j] + "\t");
             }
             System.out.println();
         }
     }
// Корректный результат появляется только при m = n, как это изменить так и не разобрался
    }
}