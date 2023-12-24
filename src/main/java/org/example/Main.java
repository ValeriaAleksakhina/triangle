package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstSide = getSide();
        int secondSide = getSide();
        int thirdSide = getSide();

        Triangle triangle = new Triangle(firstSide, secondSide, thirdSide);
        System.out.println("Площадь треугольника равна " + triangle.TriangleGetArea(firstSide, secondSide, thirdSide));
    }
        public static int getSide() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число");
            int side;
            if (scanner.hasNextInt()) {
                side = scanner.nextInt();
            } else {
                System.out.println("Вы ввели не число! Попробуйте еще раз!");

                // вот тут хочу добавить проверку, чтоб не вводили ноль. Почему нельзя? Выше же мы пишем, если ввели не число - ошибка.
                // дальше я хочу сказать "а если число, да не то -  тоже ошибка"

//                if (scanner.hasNextInt()) {
//                    side = scanner.nextInt() <= 0;
//                    System.out.println("Сторона треугольника не может быть равной нулю");
//                }
                if (scanner.hasNextInt()) {
                    scanner.next();
                    side = getSide();

                } else {
                    throw new IllegalStateException("Ошибка ввода");
                }
            }
            return side;
        }
    }



