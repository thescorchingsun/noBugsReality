package homework2;

public class Phone {
    /*
    Задача 8. Класс "Телефон"
    Создайте класс Phone с полями:
    brand (бренд телефона, тип String),
    model (модель телефона, тип String),
    price (цена телефона, тип double).
    Реализуйте:
    Конструктор для всех полей.
    Геттеры и сеттеры.
    Метод applyDiscount(double percentage), который уменьшает цену на заданный процент.
    Метод printPhoneDetails(), который выводит:
    Телефон: <brand> <model>, Цена: <price>
    В методе main создайте телефон, примените скидку и выведите его характеристики.
    */
    private String brand;
    private String model;
    private double price;

    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand() {
        this.brand = brand;
    }

    public void setModel() {
        this.model = model;
    }

    public void setPrice() {
        this.price = price;
    }

     public void applyDiscount(double percentage) {
        this.price = this.price - (this.price / 100 * percentage);
     }

   public void printPhoneDetails() {
       System.out.println("Телефон: " + this.brand + " " + this.model + " Цена: " + this.price);
   }

    public static void main(String[] args) {

        Phone phone = new Phone("Xiaomi","A3",9000);
        phone.printPhoneDetails();
        phone.applyDiscount(50);
        phone.printPhoneDetails();
    }
}
