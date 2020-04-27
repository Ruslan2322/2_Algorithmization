package Lesson02_Arrays_of_arrays;

//Найдите наибольший элемент матрицы и замените все нечетные элементы на него.

public class Ex_15 {

    public static void main(String[] args) {
        int n = 5;
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Стартовая матрица");
        Arrprint(arr);
        int Max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (Max < arr[i][j])
                    Max = arr[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] % 2 != 0)
                    arr[i][j] = Max;
            }
        }
        System.out.println("Изменённая матрица");
        Arrprint(arr);
    }
    public static void Arrprint ( int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
