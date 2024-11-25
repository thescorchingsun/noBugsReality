package homework2;

public class Rectangle {
    /*
    Задача 12. Класс "Прямоугольник"
    Создайте класс Rectangle с полями:
    width (ширина, тип double),
    height (высота, тип double).
    Реализуйте:
    Конструктор с параметрами для всех полей.
    Геттеры и сеттеры.
    Методы:
    calculateArea(), возвращает площадь прямоугольника.
    calculatePerimeter(), возвращает периметр.
    Метод printRectangleInfo(), который выводит:
    Прямоугольник: Ширина = <width>, Высота = <height>, Площадь = <area>, Периметр = <perimeter>
    В методе main создайте объект, выведите его площадь и периметр.
    */
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea() {
        return this.height * this.width;
    }
    public double calculatePerimeter() {
        return (this.height + this.width) * 2;
    }

    public void printRectangleInfo() {
        System.out.println("Прямоугольник: Ширина = " + this.width + ", Высота = " + this.height + ", Площадь = "
                + calculateArea() + ", Периметр = " + calculatePerimeter());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20, 30);
        rectangle.printRectangleInfo();
    }

}
