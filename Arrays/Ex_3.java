package Lesson02_Arrays;

//  Дан  массив  действительных  чисел,  размерность  которого  N.  Подсчитать,  сколько  в  нем  отрицательных,
// положительных и нулевых элементов.

        public class Ex_3 {
                public static void main(String[] args) {

                    int plus = 0;
                    int minus = 0;
                    int zero = 0;
                    int a = 1000;
                    int[] arr = new int[a];
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = (int) (Math.random()* (10 + 1) - 5);
                    }
                    for (int Quant : arr) {
                        if (Quant > 0)
                            plus++;
                        if (Quant < 0)
                            minus++;
                        if (Quant == 0)
                            zero++;
                    }
                    System.out.println("Позитивные элементы = " + plus);
                    System.out.println("Негативные элементы = " + minus);
                    System.out.println("Нулевые элементы = " + zero);
                }
            }