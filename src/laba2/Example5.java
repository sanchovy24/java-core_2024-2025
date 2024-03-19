package laba2;

public class Example5 {
    private double sideA; // длина прямоугольника
    private double sideB; // ширина прямоугольника

    public Example5(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideA() {
        return this.sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideB() {
        return this.sideB;
    }

    // вычисление площади прямоугольника
    public double getArea() {
        return sideA * sideB;
    }

    // вычисление периметра прямоугольника
    public double getPerimeter() {
        return 2 * (sideA + sideB);
    }

    public static void main(String[] args) {
        Example5 rectangle = new Example5(10.0, 7.0);
        System.out.println("Сторона A: " + rectangle.getSideA());
        System.out.println("Сторона B: " + rectangle.getSideB());
        System.out.println("Площадь: " + rectangle.getArea());
        System.out.println("Периметр: " + rectangle.getPerimeter());
    }
}