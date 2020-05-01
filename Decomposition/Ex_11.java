package Lesson_2_Decomposition;

// Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class Ex_11 {
    public static int EqualNum(int n) { // Нахождение количества цифр в числе.
        int count = 0;
        while (n % 10 != 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int a = 9873435;
        int b = 12348;
        if (EqualNum(a) == EqualNum(b)) {
            System.out.println("Количство цифр равно.");
        }
        if (EqualNum(a) > EqualNum(b)) {
            System.out.println("Количество цифр больше в первом числе");
        }
        if (EqualNum(a) < EqualNum(b)) {
            System.out.println("Количество цифр больше во втором числе");
        }

    }
}