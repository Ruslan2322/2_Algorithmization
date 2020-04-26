package Lesson02_Arrays_of_arrays;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Ex_3 {

    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        int k = (int) (Math.random() * 10);
        int p = (int) (Math.random() * 10);
//        System.out.println(k);
//        System.out.println(p);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
//                System.out.print(arr[i][j] + "\t");
            }
//            System.out.println();
        }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if ((i + 1 == k) || (j + 1 == p)) {
                        System.out.print(" ");
                        System.out.print(arr[i][j] + "\t");
                    }
//                    System.out.println();
                }
            }
        }
    }


