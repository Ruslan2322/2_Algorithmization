package Lesson02_Arrays;

   //Даны действительные числа a1, a2, a3 ... an. Поменять местами наибольший и наименьший элементы.

    public class Ex_4 {

        public static void main(String[] args) {
            int[] arr = new int[5];
            int max;
            int min;

            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * (10 + 1) - 5);
            }
            System.out.println("Исходный массив");
            max = min = arr[0];
            for (int quant : arr) {
                if (max < quant)
                    max = quant;
                if (min > quant)
                    min = quant;

                System.out.println(quant);
            }

            System.out.println("Изменённый массив");
            for (int i = 0; i < arr.length; i++) {
                if (max == arr[i])
                    arr[i] = min;
                else if (min == arr[i])
                    arr[i] = max;
                System.out.println(arr[i]);
            }
        }

    }

