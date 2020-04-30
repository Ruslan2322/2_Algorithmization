package Lesson_2_Decomposition;

// Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class Ex_6 {
    public static boolean NOD(int one, int two) {
        while (one != 0 && two != 0) {
            if (one > two) {
                one = one % two;
            } else {
                two = two % one;
            }
        }
        return one + two == 1;
    }

    public static void main(String[] args) {
        int numberOne = 1;
        int numberTwo = 7;
        int numberThree = 13;
        if (NOD(numberOne, numberTwo)) {
            if (NOD(numberOne, numberThree)) {
                if (NOD(numberTwo, numberThree)) {
                    System.out.println("Числа взаимнопростые");
                } else {
                    System.out.println("Числа невзаимнопростые");
                }
            } else {
                System.out.println("Числа невзаимнопростые");
            }
        } else {
            System.out.println("Числа невзаимнопростые");
        }

    }
}