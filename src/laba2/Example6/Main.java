package laba2.Example6;

public class Main {
    public static void main(String[] args) {
        Figures circle = new Circle(5);
        Figures square = new Square(2);
        Figures triangle = new Triangle(8, 9, 5);

        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Периметр круга: " + circle.getPerimeter());

        System.out.println("Площадь квадрата: " + square.getArea());
        System.out.println("Периметр квадрата: " + square.getPerimeter());

        System.out.println("Площадь треугольника: " + triangle.getArea());
        System.out.println("Периметр треугольника: " + triangle.getPerimeter());
    }
}
