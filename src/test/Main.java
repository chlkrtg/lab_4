package test;

import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Geometry figures test\n");

        System.out.println("1. 2d figures test:");
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        circle.Show();
        rectangle.Show();

        System.out.println("\n2. cylinder test:");
        Cylinder cylinder1 = new Cylinder(circle, 10.0);
        Cylinder cylinder2 = new Cylinder(rectangle, 8.0);

        cylinder1.Show();
        cylinder2.Show();

        System.out.println("\n3. add. info:");
        System.out.println("volume of a cylinder with a circle at the base: " + cylinder1.Volume());
        System.out.println("volume of a cylinder with a rectangle at the base: " + cylinder2.Volume());
    }
}