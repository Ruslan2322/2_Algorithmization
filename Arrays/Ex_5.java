package Lesson02_Arrays;

import java.util.Random;

//Даны целые числа a1, a2, a3 ... an. Вывести на печать только те числа, для которых ai > i

    public class Ex_5 {

        public static void main(String[] args) {
            int[] arr = new int[10];
            Random R = new Random();

            for (int i = 0; i < arr.length; i++) {
                arr[i] = R.nextInt(10);
                if (arr[i] > i)
                    System.out.println(arr[i]);
            }
        }
    }
