package Lesson_2_Decomposition;
import java.util.Arrays;

// Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
// являются числа, сумма цифр которых равна К и которые не большее N.

public class Ex_12 {

    public static int SumNumb(int N) { // Нахождение суммы цифр числа
        int sum = 0;
        while (N % 10 != 0) {
            sum += N % 10;
            N /= 10;
        }
        return sum;
    }

    public static int[] ArrA(int K, int N) { // Создание и заполнение массива
        int count = 0;
        int leightArrA = 0;
        for (int i = 0; i <= N; i++) {
            if (SumNumb(i) == K) {
                leightArrA++;
            }
        }
        int[] arrA = new int[leightArrA];
        for (int i = 0; i < N; i++) {
            if (SumNumb(i) == K) {
                arrA[count] = i;
                count++;
            }
        }
        return arrA;
    }

    public static void main(String[] args) {
        int K = 5, N = 78;
        System.out.println(Arrays.toString(ArrA(K, N)));
    }
}