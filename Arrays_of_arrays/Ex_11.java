package Lesson02_Arrays_of_arrays;

// Матрицу 10х20 заполнить случайными числами от 0 до 15.
// Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.

public class Ex_11 {

    public static void main(String[] args) {
        int n = 10;
        int z = 20;
        int[][] arr = new int[n][z];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random() * 15);
                System.out.print( arr[i][j]+"\t");
            }System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            int quant = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 5)
                    quant++;
                if (quant == 3) {
                    System.out.println("Строка= " + (i + 1));
                    break;
                }
            }
        }
        }
    }
