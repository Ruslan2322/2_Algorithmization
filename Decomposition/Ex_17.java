package Lesson_2_Decomposition;

// Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
// действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

public class Ex_17 {

    // Вычисление суммы цифр числа.
    public static int Sum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    // Подсчет иттераций.
    public static int NumOfItter(int num) {
        int count = 0;
        while (num > 0) {
            num = num - Sum(num);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int number = Integer.MAX_VALUE;
        System.out.println("Количество иттераций = " + NumOfItter(number));
    }
}