package homework2;

public class Currency {
    /*
    Задача 7. Класс "Курс Валют"
    Создайте класс Currency с полями:
    name (название валюты, тип String),
    rateToUSD (курс валюты к доллару США, тип double).
    Реализуйте:
    Конструктор для инициализации полей.
    Геттеры и сеттеры.
    Метод convertToUSD(double amount), который возвращает сумму в долларах для заданного количества валюты.
    Метод printCurrencyInfo(), который выводит:
    Валюта: <name>, Курс к USD: <rateToUSD>
    В методе main создайте объект валюты, выведите курс и выполните конвертацию заданной суммы в USD.
     */
    private String name;
    private double rateToUSD;

    public Currency(String name, double rateToUSD) {
        this.name = name;
        this.rateToUSD = rateToUSD;
    }

    public String getName() {
        return name;
    }

    public double getRateToUSD() {
        return rateToUSD;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRateToUSD(double rateToUSD) {
        this.rateToUSD = rateToUSD;
    }

    public double convertToUSD(double amount) {
        return amount * this.rateToUSD;
    }
    public void printCurrencyInfo() {
        System.out.println("Валюта: " + this.name + " Курс к USD: " + this.rateToUSD);
    }

    public static void main(String[] args) {

        Currency currencyEuro = new Currency("EUR", 1.06);
        Currency currencyRUB = new Currency("RUB", 0.0098);

        currencyEuro.printCurrencyInfo();
        double amount = 100;
        System.out.println("\t" + amount + " EUR -> USD: " + currencyEuro.convertToUSD(amount));
        currencyRUB.printCurrencyInfo();
        System.out.println("\t" + amount + " RUB -> USD: " + currencyRUB.convertToUSD(amount));

    }
}