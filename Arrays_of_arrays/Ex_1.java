package Lesson02_Arrays_of_arrays;

//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Ex_1 {

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if ((j % 2 == 0) && (arr[0][j] > arr[arr.length - 1][j])) ;
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }

