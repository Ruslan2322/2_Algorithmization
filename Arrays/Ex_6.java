package Lesson02_Arrays;

//Задана последовательность N вещественных чисел.
//Вычислить сумму чисел, порядковые номера которых являются простыми числами.

    public class Ex_6 {

        public static void main(String[] args) {

            int[] arr = new int[10];
            int sum = 0;
            for (int i = 1; i <= arr.length; i++) {
                if (i % i == 1 && i % 1 == i) {
                    sum = sum + i;
                    System.out.println(sum);
                }
            }
        }
    }
