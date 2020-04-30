package Lesson_2_Decomposition;

//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Ex_2 {

    public static void main(String[] args) {

        int num1 = 680;
        int num2 = 7720;
        int num3 = 5928;
        int num4 = 100376;
        System.out.println(NOD(NOD(NOD(num1, num2), num3), num4));
    }
    public static int NOD(int m, int n) {

        if (m == 0)
            return n;
        if (m == 0)
            return n;
        else if (m == n)
            return m;
        else if (m % 2 == 0 && n % 2 == 0)
            return 2 * NOD(m / 2, n / 2);
        else if (m % 2 == 0 && n % 2 != 0)
            return NOD(m / 2, n);
        else if (m % 2 != 0 && n % 2 == 0)
            return NOD(m, n / 2);
        else if (m % 2 != 0 && n % 2 != 0 && n > m)
            return NOD((n - m) / 2, m);
        else if (m % 2 != 0 && n % 2 != 0 && n < m)
            return NOD((m - n) / 2, n);
        else
            return NOD((m - n) / 2, n);
    }
}




