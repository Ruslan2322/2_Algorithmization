package Lesson_2_Decomposition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeSet;

// Натуральное  число,  в  записи  которого  n  цифр,  называется  числом  Армстронга,  если  сумма  его  цифр,
// возведенная  в  степень  n,  равна  самому  числу.  Найти  все  числа  Армстронга  от  1  до  k.  Для  решения  задачи
// использовать декомпозицию.

public class Ex_14 {
    // Проверка стоит проверять число дальше или нет
    public static boolean checkNum(long n) {
        long prevDig = 0;
        while (n > 0) {
            long currentDigit = n % 10;
            if (prevDig > currentDigit) {
                return false;
            }
            prevDig = currentDigit;
            n = n / 10;
        }
        return true;
    }
    // Нахождение суммы цифр в числе.
    public static long Sum(long num, long[][] mass) {
        int count = Long.toString(num).length();
        long sum = 0;
        while (num != 0) {
            sum += mass[(int) (num % 10)][count];
            //sum += Math.pow(number%10, count);
            num /= 10;
        }
        if (Long.toString(sum).length() != count)
            return -1;
        else
            return sum;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        SimpleDateFormat SDF = new SimpleDateFormat("ss.SSS");


        long[][] arr = new long[10][10]; // Массив цифр возведенных в стемень.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (long) Math.pow(i, j);
            }
        }
        //TreeSet<Long> set = new TreeSet<>();
        for (long i = 0; i < 1000000000; i++) {
            if (checkNum(i)) {
                long num = Sum(i, arr);
                if (num != -1) {
                    long temp = Sum(num, arr);
                    if (temp != -1 && num == temp && Long.toString(i).length() == Long.toString(temp).length()) {
                        System.out.println(num);
                    }
                }
            }
        }
    }
}