package QUIZ.Quiz05.quiz0502;

// Quiz 5-2 문제 18
public class GameCharacter {
    String name;
    int health;

    // TODO: 기본 생성자 작성
    public GameCharacter() {
        this.name = "성민";
        this.health = 100;
    }
    // TODO: 매개변수 생성자 작성
    public GameCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public static void main(String[] args) {
        // TODO: GameCharacter 객체 생성 및 출력
        GameCharacter c1 = new GameCharacter();
        GameCharacter c2 = new GameCharacter("Alice", 80);
        System.out.println(c1.name + ", " + c1.health);
        System.out.println(c2.name + ", " + c2.health);
    }
} 