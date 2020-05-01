package Lesson_2_Decomposition;

// Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
// если угол между сторонами длиной X и Y— прямой.

public class Ex_9 {

    public static double MathSquare(int a, int b, int c, int d) {
        double a1;
        double a2;
        double hyp;
        double per;
        hyp = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        a1 = (a * b) / 2;
        per = c + d + hyp;
        a2 = Math.sqrt(per * (per - c) * (per - d) * (per - hyp));
        return a1 + a2;
    }
    public static void main(String[] args) {
        int sideX = 2, sideY = 1, sideZ = 4, sideT = 6;

            System.out.println("Area is equal to " + MathSquare(sideX, sideY, sideZ, sideT));
    }
}