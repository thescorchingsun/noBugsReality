package homework2;

public class Company {
    /*
    Задача 14. Класс "Компания"
    Создайте класс Company с полями:
    name (название компании, тип String),
    employees (количество сотрудников, тип int),
    revenue (доход, тип double).
    Реализуйте:
    Конструктор для всех полей.
    Геттеры и сеттеры.
    Метод printCompanyInfo(), который выводит:
    Компания: <name>, Сотрудников: <employees>, Доход: <revenue>
    В методе main создайте объект компании и выведите его данные.
    */
    private String name;
    private int employees;
    private double revenue;

    public Company(String name, int employees, double revenue) {
        this.name = name;
        this.employees = employees;
        this.revenue = revenue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployees() {
        return employees;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public  void printCompanyInfo() {
        System.out.println("Компания: " + this.name + ", Сотрудников: " + this.employees + ", Доход: " + this.revenue);
    }

    public static void main(String[] args) {
        Company company = new Company("АрсМедика", 15, 300000);
        company.printCompanyInfo();
    }
}
