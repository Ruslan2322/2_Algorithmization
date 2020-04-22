package Exercises2;

import java.util.Random;

public class Exercise_01 {
 //В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые
//кратны данному К

    public static void main(String[] args) {
        // write your code here
        int[] arr = generateArray(50);
        int k = 1, sum = (int) 0.0;
        for (int a: arr) {
            if (a % k == 0) {
                sum += a;
            }
        }
        System.out.println(sum);
    }

    private static int[] generateArray(int num) {
        int[] arr = new int[num];
        Random rand = new Random();
        for (int i=0; i<num; i++) {
            arr[i]=rand.nextInt();
        }
        return arr;
    }
}


