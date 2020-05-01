package Lesson_2_Decomposition;

// Дано  натуральное  число  N.  Написать  метод(методы)  для  формирования  массива,  элементами  которого
// являются цифры числа N.

import java.util.Arrays;

public class Ex_10 {

    public static int Size(int n) {
        int count = 0;
        while (n % 10 != 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    public static int[] ArrayC(int n) {
        int[] arr = new int[Size(n)];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = n % 10;
            n /= 10;
        }
        return arr;
    }
    public static void main(String[] args) {
        int n = 978546545;
        System.out.println(Arrays.toString(ArrayC(n)));
    }
}