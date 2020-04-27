package Lesson02_Arrays_of_arrays;

//Отсортировать строки матрицы по возрастанию и убыванию значений.

public class Ex_13 {

    private static int[][] mass;

    public static void main(String[] args) {
        int n = 5;
        int quant;
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Страртовая матрица");
        Arrprint(arr);
        for (int j = 0; j < arr[0].length; j++) {
            quant = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1][j] < arr[i][j]) {
                    int A = arr[i][j];
                    arr[i][j] = arr[i + 1][j];
                    arr[i + 1][j] = A;
                    quant++;
                }
            }
            if (quant != 0)
                j--;
            break;
        }
        System.out.println("По возрастанию");
        Arrprint(arr);
        for (int j = 0; j < arr[0].length; j++) {
            quant = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1][j] > arr[i][j]) {
                    int A = arr[i][j];
                    arr[i][j] = arr[i + 1][j];
                    arr[i + 1][j] = A;
                    quant++;
                }
            }
            if (quant != 0)
                j--;
        }
        System.out.println("По убыванию");
        Arrprint(arr);
    }

    public static void Arrprint ( int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

