package homework2;

public class Book {
      /*
        Задача 1. Создание класса "Книга"
        Создайте класс Book с полями:
        title (название книги, тип String),
        author (автор, тип String),
        price (цена, тип double).
        Реализуйте:
        Конструктор, который принимает все поля.
        Геттеры и сеттеры для каждого поля.
        В методе main создайте объект класса Book, измените через сеттеры автора и цену,
        а затем выведите в консоль информацию о книге.
      */
   private String title;
   private String author;
   private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void print() {
        System.out.println("Название книги: " + this.title + "; Автор книги: " + this.author + "; Цена книги " + this.price);
    }

    public static void main(String[] args) {
        Book book = new Book("1984","George Orwell", 200.50);
        book.print();
        book.setAuthor("Ken Kesey");
        book.setPrice(70.30);
        book.print();
    }
}
