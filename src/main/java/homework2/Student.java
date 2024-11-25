package homework2;

public class Student {
    /*
    Задача 5. Класс "Студент"
    Создайте класс Student с полями:
    name (имя, тип String),
    studentId (идентификатор студента, тип int),
    gpa (средний балл, тип double).
    Реализуйте:
    Конструктор для всех полей.
    Геттеры и сеттеры.
    Метод printStudentDetails(), который выводит:
    Студент: <name>, ID: <studentId>, GPA: <gpa>
    В методе main создайте массив из объектов Student, заполните его, и выведите данные каждого студента.
    */
    private String name;
    private int studentId;
    private double gpa;

    public Student(String name, int studentId, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void printStudentDetails() {
        System.out.println("Студент: " + this.name + " ID: " + this.studentId + " GPA: " + this.gpa);
    }

    public static void main(String[] args) {
        Student[] students = new Student[4];

        students[0] = new Student("Anna", 11, 98.99);
        students[1] = new Student("Bob", 3, 76.43);
        students[2] = new Student("Ivan", 25, 96.15);
        students[3] = new Student("Nikita", 14, 70.00);

        for(int i = 0; i < students.length; i++) {
            students[i].printStudentDetails();
        }
    }
}
