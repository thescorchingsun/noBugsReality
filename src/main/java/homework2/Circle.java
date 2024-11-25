package homework2;

public class Circle {
    /*
    Задача 15. Класс "Круг"
    Создайте класс Circle с полями:
    radius (радиус, тип double).
    Реализуйте:
    Конструктор с параметром radius.
    Методы:
    calculateCircumference(), возвращает длину окружности.
    calculateArea(), возвращает площадь круга.
    Метод printCircleInfo(), который выводит:
    Круг: Радиус = <radius>, Площадь = <area>, Длина окружности = <circumference>
    В методе main создайте круг и выведите его данные.
     */
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public double calculateArea() {
        return Math.PI * Math.sqrt(radius);
    }

    public void printCircleInfo() {
        System.out.println("Круг: Радиус = " + this.radius + ", Площадь = " + calculateArea() +
                ", Длина окружности = " + calculateCircumference());
    }

    public static void main(String[] args) {
        Circle circle = new Circle(100);
        circle.printCircleInfo();
    }
}


