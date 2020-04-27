package Lesson02_Arrays_of_arrays;
import java.util.Random;

/* Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
 ...,n2  так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
 собой. Построить такой квадрат. Пример магического квадрата порядка 3:*/

public class Ex_16 {

    public static void main(String[] args) {
        System.out.println("Magic Sudoku :)");
        while (true) {
            boolean flag = true;
            int n = 3;
            Random R = new Random();
            int[] a = new int[n * n];
            for (int i = 0; i < a.length; ++i) {
                int j = R.nextInt(i + 1);
                a[i] = a[j];
                a[j] = i + 1;
            }
            int[][] arr = new int[n][n];
            int k = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = a[k];
                    k++;
                }
            }
            int SudocuSum = 0;
            for (int i = 0; i < arr.length; i++) {
                SudocuSum += arr[0][i];
            }
            if (SudocuSum != (n * (n * n + 1) / 2)) {
                continue;
            }
            int D = 0;
            for (int i = 0; i < arr.length; i++) {
                int sumStr = 0, sumStolb = 0;
                for (int j = 0; j < arr.length; j++) {
                    sumStr += arr[i][j];
                    sumStolb += arr[j][i];
                }
                D += arr[i][i];
                if ((sumStr != SudocuSum) || (sumStolb != SudocuSum)) {
                    flag = false;
                    break;
                }
            }
            if (!flag)
                continue;
            if (D == SudocuSum) {
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr.length; j++) {
                        System.out.print(arr[i][j] + "\t");
                    }
                    System.out.println();
                }
                break;
            }
        }
    }
}