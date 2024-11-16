public class Homework1 {

    /*
    1. Проверка делимости на 5 и 7.
    Напишите функцию, которая принимает целое число и возвращает true,
     если оно делиться на 5 и 7 одновременно, в противном случае false
     */
    public static boolean task1(int number) {
        return number % 5 == 0 && number % 7 == 0;
    }

    /*
    2. Определение принадлежности числа к интервалу.
    Создайте функцию, которая принимает число и проверяет, входит ли оно в интервал от 10 до 20 включительно.
    Если попадает в интервал, то true, иначе false.
     */
    public static boolean task2(int number) {
        return number >= 10 && number <= 20;
    }

    /*
    3. Проверка на квадрат числа.
    Создайте функцию, которая принимает два числа и возвращает true, если одно из чисел является
    квадратом другого, и false в противном случае.
     */
    public static boolean task3(int a, int b) {
        return a == b * b || b == a * a;
    }

    /*
    4. Проверка последней цифры.
    Создайте функцию, которая принимает число и проверяет, заканчивается ли оно на 5. Верните true, если заканчивается
    и false если нет.
     */
    public static boolean task4(int number) {
        return number % 10 == 5;
    }

    /*
    5. Проверка, является ли сумма цифр четной.
    Реализуйте функцию, которая принимает число, суммирует его цифры и возвращает true,
    если сумма четная, и false если нечетная.
    */
    public static boolean task5(int a, int b) {
        return ((a + b) % 2 == 0);
    }

    /*
    6. Сравнение двух чисел по модулю.
    Напишите функцию, которая принимает два числа и возвращает
    true, если модули чисел равны, и false в противном случае.
    Теория.
    Если a − b делится на m, то a и b сравнимы по модулю m. Запись: a ≡ b (mod m).
    Пример 17 ≡ 5 (mod 6).
    17 - 5 = 12
    12 % 6 = 2 остатка нет
    */
    public static boolean task6(int a, int b, int c) {
        return (a - b) % c == 0;
    }

    /*
    7.Проверка знака числа.
    Создайте функцию, которая принимает число и возвращает "Positive", если оно положительное "Negative", если
    оно отрицательное  и "Zero", если оно равно нулю.
     */

    public static String task7(int number) {
        if (number > 0) {
            return "Positive";
        }
        if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    /*
    8. Проверка делимости 2 или 3.
    Создайте функцию, которая принимает число и возвращает true, если оно делится на 2 или 3, и false в противном случае.
     */
    public static boolean task8(int number) {
        return number % 2 == 0 || number % 3 == 0;
    }

    /*
    9. Четность суммы двух чисел.
    Создайте функцию, которая принимает два числа и возвращает "Even", если сумма чисел четная, и "Odd", если нечетная.
   */
    public static String task9(int a, int b) {
        if ((a + b) % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }

    /*
    10. Определение числа, кратного 4 и 6.
    Создайте функцию, которая проверяет, делиться ли число на 4 и на 6. Если да, то вернуть true, если нет, то false.
    */
    public static boolean task10(int number) {
        return number % 4 == 0 && number % 6 == 00;
    }

    /*
    11. Проверка суммы на четность и кратность.
    Реализуйте метод, который принимает два числа и возвращает
    "Even and Divisible by 10", если их сумма четная и делится на 10,
    "Even but not Divisible by 10", если сумма четная, но не делится на 10,
     и "Odd", если сумма нечетная.
     */
    public static String task11(int a, int b) {

        if ((a + b) % 2 == 0 && (a + b) % 10 == 0) {
            return "Even and Divisible by 10";
        } else if ((a + b) % 2 == 0 && (a + b) % 10 != 0) {
            return "Even but not Divisible by 10";
        } else {
            return "Odd";
        }
    }

    /*
    12. Максимум трех чисел.
    Напишите метод, который принимает три числа и возвращает наибольшее из них.
     */
    public static int task12(int a, int b, int c) {
        return Math.max(Math.max(a, b), Math.max(b, c));
    }

    /*
    13. Проверка на палиндромность числа.
    Создайте функцию, которая принимает целое число и проверяет, является ли оно палиндромом, например,
    121 или 12321. Верните true, если да, и false, если нет.
     */
    public static boolean task13(int number) {
        StringBuilder builder = new StringBuilder();
        String str = builder.append(number).reverse().toString();
        int reversedNumber = Integer.parseInt(str);
        return number == reversedNumber;
    }

    /*
    14. Кратность чисел и их сумма.
    Реализуйте функцию, которая принимает два числа.
     Если оба числа кратны 3, верните их суммы,
     если одно из них кратно 3, верните удвоенное значение второго числа;
     если ни одно ни другое кратно 3, верните null;
     */
    public static Integer task14(int a, int b) {
        if (a % 3 == 0 && b % 3 == 0) {
            return a + b;
        } else if (a % 3 == 0 || b % 3 == 0) {
            return b * 2;
        } else {
            return null;
        }
    }

    /*
   15. Проверка возраста на категорию.
   Напишите функцию, которая принимает возраст и возвращает категорию
   child - до 12 лет
   teenager - от 13 до 17
   adult - от 18 до 64
   senior - от 65 лет и старше
    */
    public static String task15(int age) {
        if (age <= 12) {
            return "child";
        }
        if (13 <= age && age <= 17) {
            return "teenager";
        }
        if (18 <= age && age <= 64) {
            return "adult";
        } else {
            return "senior";
        }
    }

    /*
   16. Проверка на делимость с остальными значениями.
   Функция принимает два числа
   Проверяет делится ли первое число на второе с остатком равным 2.
   Если делится с остатком 2, то true
   если делится без остатка то false

    */
    public static boolean task16(int a, int b) {
        if (a % b == 2) {
            return true;
        } else if (a % b == 0) {
            return false;
        }
        return false;
    }

    //метод для оформления задач
    public static int number = 1;
    public static void task() {
        System.out.println("\u001B[32m" + " ------------------ " + "\u001B[34m" + "task " + number
                + "\u001B[32m" + " ------------------ " + "\u001B[0m");
        number++;
    }

    public static void main(String[] args) {

        task();
        System.out.println(task1(35));
        System.out.println(task1(34));

        task();
        System.out.println(task2(15));
        System.out.println(task2(50));

        task();
        System.out.println(task3(5, 25));
        System.out.println(task3(5, 24));

        task();
        System.out.println(task4(75));
        System.out.println(task4(74));

        task();
        System.out.println(task5(2, 2));
        System.out.println(task5(2, 3));

        task();
        System.out.println(task6(17, 5, 6));
        System.out.println(task6(17, 5, 7));

        task();
        System.out.println(task7(3));
        System.out.println(task7(-5));
        System.out.println(task7(0));

        task();
        System.out.println(task8(12));
        System.out.println(task8(11));

        task();
        System.out.println(task9(2, 2));
        System.out.println(task9(3, 2));

        task();
        System.out.println(task10(23));
        System.out.println(task10(24));

        task();
        System.out.println(task11(10, 20));
        System.out.println(task11(4, 4));
        System.out.println(task11(4, 3));

        task();
        System.out.println(task12(1, 2, 3));
        System.out.println(task12(10, 7, 10));
        System.out.println(task12(9, 8, 8));

        task();
        System.out.println(task13(12321));
        System.out.println(task13(52327));

        task();
        System.out.println(task14(3, 9));
        System.out.println(task14(9, 2));
        System.out.println(task14(1, 5));

        task();
        System.out.println(task15(7));
        System.out.println(task15(15));
        System.out.println(task15(33));
        System.out.println(task15(75));

        task();
        System.out.println(task16(8, 3));
        System.out.println(task16(9, 3));
        System.out.println(task16(10, 3));
    }
}

