package Lesson02_Arrays_of_arrays;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Ex_2 {

    public static void main(String[] args) {

        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) ((Math.random() * 100));
//                System.out.print(arr[i][j] + "\t");
            }
//            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.print(" ");
                    System.out.print(arr[i][j] + "\t");

                }
            }
        }
    }
}
