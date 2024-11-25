package homework2;

public class Player {
    /*
    Задача 11. Класс "Игрок"
    Создайте класс Player с полями:
    nickname (никнейм, тип String),
    level (уровень, тип int),
    score (очки, тип int).
    Реализуйте:
    Конструктор с параметрами для всех полей.
    Геттеры и сеттеры.
    Метод levelUp(), который увеличивает уровень на 1.
    Метод addScore(int points), который добавляет очки.
    Метод printPlayerInfo(), который выводит:
    Игрок: <nickname>, Уровень: <level>, Очки: <score>
    В методе main создайте игрока, поднимите уровень, добавьте очки и выведите данные.
     */
    private String nickname;
    private int level;
    private int score;

    public Player(String nickname, int level, int score) {
        this.nickname = nickname;
        this.level = level;
        this.score = score;
    }

    public String getNickname() {
        return nickname;
    }

    public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void levelUp() {
     this.level++;
    }

    public void addScore(int points) {
        this.score += points;
    }

   public void printPlayerInfo() {
       System.out.println("Игрок: " + this.nickname + " Уровень: " + this.level + " Очки: " + this.score);
   }

    public static void main(String[] args) {
        Player player = new Player("Jimmy", 7, 86);
        player.levelUp();
        player.addScore(4);
        player.printPlayerInfo();
    }

}
