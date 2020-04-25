package Lesson02_Arrays;

import java.util.Random;
// Дана последовательность дествительных чисел a1, a2,...,an Заменить все её члены
// больше данного Z этим числом. Подсчитать количество замен.
        public class Ex_2 {
        public static void main(String[] args) {
            int Z = 56;
            int summ = 0;
            int[] arr = new int[100];
            Random R = new Random();


            for (int i = 0; i < arr.length; i++) {
                arr[i] = R.nextInt(100);
                if (arr[i] > Z) {
                    arr[i] = Z;
                    summ++;
//                    System.out.println(arr[i]);
                }
            }
            System.out.println("Количество замен = " + summ);
        }
    }
