package homework2;

public class Car {
    /*
    Задача 3. Класс "Машина"
    Создайте класс Car с полями:
    brand (бренд, тип String),
    model (модель, тип String),
    year (год выпуска, тип int),
    price (цена, тип double).
    Реализуйте:
    Конструктор, который принимает параметры brand, model, year.
    Методы:
    getBrand(), getModel(), getYear() и getPrice().
    setPrice(double price).
    Метод printCarInfo(), который выводит:
    Бренд: <brand>, Модель: <model>, Год: <year>, Цена: <price>
    В методе main создайте объект класса Car, задайте цену через сеттер, а затем выведите всю информацию о машине.
     */
    private String brand;
    private String model;
    private int year;
    private double price;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

   public int getYear() {
        return year;
   }

   public double getPrice() {
        return price;
    }

   public void setPrice(double price) {
        this.price = price;
   }

    public void printCarInfo() {
        System.out.println("Бренд: " + this.brand + " Модель: " + this.model + " Год: " + this.year + " Цена: " + this.price);
    }

    public static void main(String[] args) {
        Car car = new Car("Nissan","A10",2005);
        car.setPrice(1500.50);
        car.printCarInfo();
    }
}
