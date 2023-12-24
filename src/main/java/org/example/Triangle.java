package org.example;

public class Triangle {
    private int firstSide, secondSide, thirdSide;

    public Triangle(int firstSide, int secondSide, int thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;

// как между собой связать проверку на треугольник и само определение понятия "треугольник" из строки 25?
// я там пишу, что если со сторонами всё пучком, то оно треугольник. И че с ними дальше делать с этими двумя методами?
// впихнуть проверку в метод getSide? Где мы получаем от пользователя стороны?

        boolean isTriangle = false; // проверка на треугольник
        if (isTriangle) {
            throw new IllegalStateException("Это не треугольник");
        }
    }


    public double TriangleGetArea(int firstSide, int secondSide, int thirdSide) {
        int pp = (firstSide + secondSide + thirdSide) / 2;//  находим полупериметр
        return Math.sqrt(pp * (pp - firstSide) * (pp - secondSide) * (pp - thirdSide)); // находим площадь

    }

    boolean isTriangle(int firstSide, int secondSide, int thirdSide) {
        if ((firstSide + secondSide >= thirdSide) || (secondSide + thirdSide >= firstSide) || (firstSide + thirdSide >= secondSide)) {
            final boolean triangle = true;
        } else {
            throw new IllegalStateException("Это не треугольник");
        }

        return false;
    }
}







