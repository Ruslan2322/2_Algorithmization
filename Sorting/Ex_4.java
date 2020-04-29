package Lesson_02_Sorting;

// Сортировка обменами. Дана последовательность чисел a1<=a2<=   <=aN .Требуется переставить числа в
// порядке возрастания. Для этого сравниваются два соседних числа a i и a i + 1 . Если a i > a i + 1 , то делается
// перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
// Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

public class Ex_4 {

    public static void main(String[] args) {

        int[] arr = new int[]{43, 54, 65, 756, 34, 33, 55, 65};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int T = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = T;
                    count++;
                }
            }
        }
        for (int quant : arr)
            System.out.print(quant + " ");
        System.out.println();
        System.out.println("Количество перестановок = " + count);
    }
}