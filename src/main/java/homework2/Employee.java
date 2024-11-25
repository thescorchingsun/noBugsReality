package homework2;

public class Employee {
    /*
    Задача 9. Класс "Сотрудник"
    Создайте класс Employee с полями:
    name (имя сотрудника, тип String),
    position (должность, тип String),
    salary (зарплата, тип double).
    Реализуйте:
    Конструктор для всех полей.
    Геттеры и сеттеры.
    Метод increaseSalary(double percentage), который увеличивает зарплату на заданный процент.
    Метод printEmployeeInfo(), который выводит:
    Сотрудник: <name>, Должность: <position>, Зарплата: <salary>
    В методе main создайте нескольких сотрудников, увеличьте их зарплату и выведите их данные.
    */
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        this.salary = this.salary + (this.salary / 100 * percentage);
    }

    public void printEmployeeInfo() {
        System.out.println(" Сотрудник: " + this.name + " Должность: " + this.position + " Зарплата: " + this.salary);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Бобров", "Технолог", 1000);
        employee1.increaseSalary(50);
        employee1.printEmployeeInfo();

        Employee employee2 = new Employee("Морозова", "Инженер", 1200);
        employee2.increaseSalary(15.50);
        employee2.printEmployeeInfo();

        Employee employee3 = new Employee("Смирнов", "Техник", 950);
        employee3.increaseSalary(30);
        employee3.printEmployeeInfo();

    }
}


