package homework2;

public class Triangle {
    /*
    Задача 10. Класс "Треугольник"
    Создайте класс Triangle с полями:
    a (сторона A, тип double),
    b (сторона B, тип double),
    c (сторона C, тип double).
    Реализуйте:
    Конструктор для всех сторон.
    Геттеры и сеттеры.
    Метод calculatePerimeter(), который возвращает периметр треугольника.
    Метод calculateArea(), который возвращает площадь треугольника по формуле Герона.
    Метод printTriangleInfo(), который выводит стороны, периметр и площадь.
    В методе main создайте объект треугольника и выведите его данные.
     */

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double calculatePerimeter() {
        return this.a + this.b + this.c;
    }

    public double calculateArea() {
        double p = calculatePerimeter() / 2.0;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }

    public void printTriangleInfo() {
        System.out.println("Сторона a: " + this.a + ", " + "Сторона b: " + this.b + ", " + "Сторона c: " + this.c);
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
    }

    public static void main(String[] args) {
    Triangle triangle = new Triangle(10.5, 20.0, 30.2);
    triangle.printTriangleInfo();
    }

}
