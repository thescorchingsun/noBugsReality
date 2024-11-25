package homework2;

public class Product {
    /*
    Задача 4. Класс "Товар"
    Создайте класс Product с полями:
    name (название товара, тип String),
    category (категория товара, тип String),
    quantity (количество, тип int),
    pricePerUnit (цена за единицу, тип double).
    Реализуйте:
    Конструктор с параметрами для всех полей.
    Геттеры и сеттеры.
    Метод calculateTotalPrice(), который возвращает общую стоимость товара (quantity * pricePerUnit).
    Метод printProductInfo(), который выводит:
    Товар: <name>, Категория: <category>, Количество: <quantity>, Общая стоимость: <totalPrice>
    В методе main создайте объект, измените количество через сеттер, а затем выведите полную информацию о товаре.
     */

    private String name;
    private String category;
    private int quantity;
    private double pricePerUnit;
    private double totalPrice;

    private Product(String name, String category, int quantity, double pricePerUnit) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public double calculateTotalPrice() {
        return totalPrice = quantity * pricePerUnit;
    }

    public void printProductInfo() {
        System.out.println("Товар: " + this.name + " Категория: " + this.category +
                " Количество: " + this.quantity + " Общая стоимость: " + this.totalPrice);
    }

    public static void main(String[] args) {
        Product product = new Product("апельсин","фрукты",3, 1.50);
        product.setQuantity(10);
        product.calculateTotalPrice();
        product.printProductInfo();
    }

}
