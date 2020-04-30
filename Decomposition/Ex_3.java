package Lesson_2_Decomposition;

//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.

public class Ex_3 {

    public static void main(String[] args) {

        int a = 6;
        double areaOfTriangle;
        int numberOfTrianglesInHexagon = 6;
        areaOfTriangle = AreaOfTriangle(a) * numberOfTrianglesInHexagon;
        System.out.println(areaOfTriangle);
    }
    public static double AreaOfTriangle(int side) { // Площадь равностороннего треугольника.
        return Math.pow(side, 2) * Math.sqrt(3) / 4;
    }
}