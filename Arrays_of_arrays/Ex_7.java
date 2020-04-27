package Lesson02_Arrays_of_arrays;

//Сформировать квадратную матрицу порядка N по правилу: A[I,J] = sin((I^2-J^2)/N) и подсчитать количество положительных элементов

public class Ex_7 {

    public static void main(String[] args) {

        int N = 10;
        double[][] arr = new double[N][N];
        int plus = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2))% N);
                if (arr[i][j] > 0) {
                    plus++;
                    System.out.print(arr[i][j] + "\t");
                }
            }
            System.out.println();
        }
        System.out.println("Количество плюсовых элементов:  "+ plus);
    }
}