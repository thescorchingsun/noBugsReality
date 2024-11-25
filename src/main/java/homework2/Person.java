package homework2;

public class Person {
    /*
    Задача 2. Класс "Человек"
    Создайте класс Person с полями:
    name (имя, тип String),
    age (возраст, тип int),
    gender (пол, тип String).
    Реализуйте:
    Конструктор с параметрами name и age.
    Конструктор по умолчанию (без параметров).
    Геттеры и сеттеры.
    Добавьте метод printInfo(), который выводит информацию о человеке в формате:
    Имя: <name>, Возраст: <age>, Пол: <gender>
    В методе main создайте несколько объектов класса Person, вызовите метод printInfo() для каждого объекта.
    */

    private String name;
    private int age;
    private String gender;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void printInfo() {
        System.out.println("Имя: " + this.name + " Возраст: " + this.age + " Пол: " + this.gender);
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Нина");
        person1.setAge(15);
        person1.setGender("женский");
        person1.printInfo();

        Person person2 = new Person();
        person2.setName("Иван");
        person2.setAge(19);
        person2.setGender("мужской");
        person2.printInfo();

        Person person3 = new Person();
        person3.setName("Лена");
        person3.setAge(30);
        person3.setGender("женский");
        person3.printInfo();

    }

}
