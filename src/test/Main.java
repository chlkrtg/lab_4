package test;

import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Тестирование геометрических фигур ===\n");

        System.out.println("1. Тестирование 2D фигур:");
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        circle.Show();
        rectangle.Show();

        System.out.println("\n2. Тестирование цилиндров:");
        Cylinder cylinder1 = new Cylinder(circle, 10.0);
        Cylinder cylinder2 = new Cylinder(rectangle, 8.0);

        cylinder1.Show();
        cylinder2.Show();

        System.out.println("\n3. Дополнительная информация:");
        System.out.println("Объем цилиндра с круглым основанием: " + cylinder1.Volume());
        System.out.println("Объем цилиндра с прямоугольным основанием: " + cylinder2.Volume());
    }
}