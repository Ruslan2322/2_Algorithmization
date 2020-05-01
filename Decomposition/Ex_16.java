package Lesson_2_Decomposition;

// Написать  программу,  определяющую  сумму  n  -  значных  чисел,  содержащих  только  нечетные  цифры.
// Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

public class Ex_16 {
    // Проверка цифр на нечетность
    public static boolean isOddDigit(int num) {
        int countIn = Integer.toString(num).length();
        int countO = 0;
        while (num > 0) {
            if ((num % 10) % 2 != 0) {
                countO++;
            }
            num /= 10;
        }
        if (countIn == countO) {
            return true;
        } else {
            return false;
        }
    }
    // Сумма всех цифр числа.
    public static int Sum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    // Проверка цифр на четность
    public static int ParityNum(int sum) {
        int count = 0;
        while (sum > 0) {
            if ((sum % 10) % 2 == 0) {
                count++;
            }
            sum /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 978645; i++) {
            if (i % 2 != 0) {
                if (isOddDigit(i)) {
                    System.out.println("Число со всеми нечетными цифрами = " + i + " Сумма всех цифр = " + Sum(i) + " Количество четных цифр = " + ParityNum(Sum(i)));
                }
            }
        }
    }
}