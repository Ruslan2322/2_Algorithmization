package Lesson02_Arrays_of_arrays;

//Сформировать квадратную матрицу порядка n по заданному образцу (n-четное).

public class Ex_5 {

    public static void main(String[] args) {

        int n = 10;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                arr[i][j] = i + 1;
            }
        }
        Arrprint(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
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
}













//        int n = 6;
//        int[][] mass = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n - i; j++) {
//                mass[i][j] = i + 1;
//            }
//        }
//        for (int i = 0; i < mass.length; i++) {
//            for (int j = 0; j < mass[i].length; j++) {
//                System.out.print(mass[i][j] + "\t");
//            }
//            System.out.println();
//        }
//    }
//}