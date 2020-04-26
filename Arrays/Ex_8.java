package Lesson02_Arrays;

//Дана последовательность целых чисел a1, a2, ..., an. Образовать новую последовательность,
// выбросив из исходной те члены, которые равны min(a1,a2, ..., an).

public class Ex_8 {

    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Стартовая последовательность");
        for (int quant : arr)
            System.out.print(quant + ", ");
        int min = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min)
                count++;
        }
        int[] arrO = new int[arr.length - count];
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                arrO[i - count] = arr[i];
            } else
                count++;
        } System.out.println("\nИзменённая последовательность");
        for (int quant : arrO) {
            System.out.print(quant + ", ");
        }
    }
}