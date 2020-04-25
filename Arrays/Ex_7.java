package Lesson02_Arrays;

//Даны действительные числа a1, a2, a3 ... an. Найти max(a1 + a2, a2 + a3, ..., an + a(n+1).

import static java.lang.Math.random;

public class Ex_7 {

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (random() * 10);
        }
        int max = arr[0] + arr[1];
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] + arr[i + 1]) > max)
                max = arr[i] + arr[i + 1];
        }
        System.out.println(max);
    }
}




