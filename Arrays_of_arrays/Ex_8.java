package Lesson02_Arrays_of_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// В числовой матрице поменять местами два столбца (любых столбца),
// т.е. все элементы одного столбца поставить на соответствующие им позиции другого,
// а его элементы переместить в первый.


public class Ex_8 {

    public static void main(String[] args) throws IOException {
        int n = 6;
        int a;
        int b;
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        while (true) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("1 Столбец");
                a = Integer.parseInt(reader.readLine());
                if (a > n)
                    throw new Exception();
                System.out.println("2 Столбец");
                b = Integer.parseInt(reader.readLine());
                if (b > n)
                    throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("Проверить ввод");
            }
        }
        System.out.println("Начальная матрица");
        Arrprint(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[i][j] + "\t");
            }
//            System.out.println();
        }
        if (a < b)
            change(a, b, arr);
        else
            change(b, a, arr);
        System.out.println("Конечный результат");
        Arrprint(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
            }
        }
    }
    private static void Arrprint(int[][] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
        }
    public static void change(int b, int a, int[][] arr) {
        int A = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == a - 1)
                    A = arr[i][j];
                if (j == b - 1) {
                    arr[i][a - 1] = arr[i][j];
                    arr[i][j] = A;
                }
            }
        }
    }
}




