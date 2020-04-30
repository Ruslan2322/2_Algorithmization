package Lesson_2_Decomposition;

// На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
// из пар точек самое большое расстояние. Указание. Координаты точек занести в массив

public class Ex_4 {

    public static void main(String[] args) {
        int quantofpoints = 10;
        System.out.println(MaxDistance(CreateMass(quantofpoints)));
    }

    public static int[][] CreateMass(int quant) {
        int[][] arr = new int[quant][quant];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        return arr;
    }
    public static double MaxDistance(int[][] arr) {
        double distance = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - 1 - i; j++) {
                double distanceTemp = Math.sqrt(Math.pow((arr[i][0] - arr[i + j][0]), 2) + Math.pow((arr[i][1] - arr[i + j][1]), 2));
                if (distanceTemp > distance) {
                    distance = distanceTemp;
                }
            }

        }
        return distance;
    }
}