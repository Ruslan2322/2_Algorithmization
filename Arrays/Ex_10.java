package Lesson02_Arrays;

//Дан целочисленный массив с количеством элементов n. Сжать массив,
// выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).

public class Ex_10 {

    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        for (int quant : arr)
            System.out.print(quant + ", ");
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (i >= arr.length / 2)
                arr[i] = 0;
            else {
                arr[i] = arr[i + count];
                count++;
            }
        }
        System.out.println();
        for (int quant : arr)
            System.out.print(quant + ", ");
    }
}