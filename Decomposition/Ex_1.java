package Lesson_2_Decomposition;

//Написать метод(методы) для нахождения наибольшего общего делителя(НОД) и наименьшего общего кратного двух натуральных чисел.

public class Ex_1 {

    public static void main(String[] args) {
        int A = 35;
        int B = 23;
        System.out.println(NOK(A, B));
    }

    public static int NOK(int a, int b) {
        return (a * b) / NOD(a, b);
    }

    public static int NOD(int a, int b) {
        if (a == b)
            return a;
        if (a == 0)
            return b;
        else if (b == 0)
            return a;
        else if (a == 1 || b == 1)
            return 1;
        else if (a % 2 == 0 && b % 2 == 0)
            return 2 * NOD(a / 2, b / 2);
        else if (a % 2 == 0 && b % 2 != 0)
            return NOD(a / 2, b);
        else if (a % 2 != 0 && b % 2 == 0)
            return NOD(a, b / 2);
        else if (a % 2 != 0 && b % 2 != 0 && b > a)
            return NOD((b - a) / 2, a);
        else
            return NOD((a - b) / 2, b);
    }
}