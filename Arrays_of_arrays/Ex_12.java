package Lesson02_Arrays_of_arrays;

//Отсортировать строки матрицы по возрастанию и убыванию значений.

public class Ex_12 {

    public static void main(String[] args) {
        int n = 5;
        int quant;
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Стартовая матрица");
        Arrprint(arr);
        for (int i = 0; i < arr.length; i++) {
            quant = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i][j + 1] < arr[i][j]) {
                    int A = arr[i][j];
                    arr[i][j] = arr[i][j + 1];
                    arr[i][j + 1] = A;
                    quant++;
                }
            }
            if (quant != 0)
                i--;
        }
        System.out.println("По возрастанию");
        Arrprint(arr);
        for (int i = 0; i < arr.length; i++) {
            quant = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i][j + 1] > arr[i][j]) {
                    int A = arr[i][j];
                    arr[i][j] = arr[i][j + 1];
                    arr[i][j + 1] = A;
                    quant++;
                }
            }
            if (quant != 0)
                i--;
        }
        System.out.println("По убыванию");
                Arrprint(arr);
        for (int i = 0; i < arr.length; i++) {
            quant = 0;
            for (int j = 0; j < arr[i].length - 1; j++) {
                if (arr[i][j - 1] > arr[i][j]) {
                    int A = arr[i][j];
                    arr[i][j] = arr[i][j + 1];
                    arr[i][j + 1] = A;
                    quant++;
                }
            }
            if (quant != 0)
                i--;
        }
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


