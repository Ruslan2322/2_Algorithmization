package Lesson_2_Decomposition;

// Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Ex_7 {
    public static int Factorial(int num) {
        if (num == 1 || num == 0) {
            return num;
        } else {
            return num * Factorial(num - 1);
        }
    }
    private static int Sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0)
                sum += Factorial(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        int a = 9;
        int sum1 = Sum(a);
        System.out.println("Сумма факториалов первых "+a+" чисел = "+sum1);
    }
}

