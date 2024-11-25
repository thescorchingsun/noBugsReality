package homework2;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    /*
        Задача 13. Класс "Клиент Интернет-магазина"
        Создайте класс Customer с полями:
        name (имя клиента, тип String),
        email (почта, тип String),
        purchaseHistory (история покупок, тип List<String>).
        Реализуйте:
        Конструктор для имени и почты.
        Методы:
        addPurchase(String item), добавляет товар в историю покупок.
        printPurchaseHistory(), выводит:
        Клиент: <name>, История покупок: <history>
        В методе main создайте клиента, добавьте несколько покупок и выведите историю.
    */
    private String name;
    private String email;
    private List<String> purchaseHistory = new ArrayList<>();

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void addPurchase(String item) {
        purchaseHistory.add(item);
    }

    public void printPurchaseHistory() {
        System.out.println("Клиент: " + this.name + " История покупок: " + this.purchaseHistory);
    }

    public static void main(String[] args) {
        Customer customer = new Customer("Бобров", "shop@mail.ru");
        customer.addPurchase("Сок");
        customer.addPurchase("Яблоки");
        customer.addPurchase("Апельсины");
        customer.printPurchaseHistory();

    }


}
