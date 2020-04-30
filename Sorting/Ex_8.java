package Lesson_02_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//    Даны дроби p1/q1, p2/q2, ..., pn/qn (pi, qi - натуральнае). Составить программу,
//    которая приводит эти дроби к общему знаменателю и упорядочивает их в  порядке возрастания.

public class Ex_8 {
    public static void main(String[] args) {

        Fraction [] array = {new Fraction(5, 2), new Fraction(5, 3),
                new Fraction(8, 3), new Fraction(2, 13),
                new Fraction(3, 8), new Fraction(18, 25),
                new Fraction(5, 6), new Fraction(15, 4)};

        Denominator(array);
        sortArray(array);
        for (Fraction element : array) {
            System.out.print(element + ", ");
        }
        System.out.print("\b\b");
    }
    private static void Denominator(Fraction[] array) {
        boolean Common = false;
        int commonDenominator = 0;
        while (!Common) {
            Common = true;
            commonDenominator++;
            for (Fraction element : array) {
                if (commonDenominator % element.denom != 0) {
                    Common = false;
                    break;
                }
            }
        }
        for (Fraction element : array) {
            element.numer *= (double) commonDenominator / element.denom;
            element.denom = commonDenominator;
        }
    }
    private static void sortArray(Fraction[] array) {
        for (int i = array.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].numer > array[j + 1].numer) {
                    Fraction temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    static class Fraction {
        int numer;
        int denom;
        Fraction(int numer, int denom) {
            this.numer = numer;
            this.denom = denom;
        }

        @Override
        public String toString() {
            return String.format("%d/%d", numer, denom);
        }
    }

}