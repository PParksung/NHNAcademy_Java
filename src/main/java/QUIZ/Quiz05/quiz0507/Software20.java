package QUIZ.Quiz05.quiz0507;

// Quiz 5-7 문제 20: 기본 메서드로 기능 확장
interface Updatable20 {
    void update();
    default void reset() {
        System.out.println("Resetting to default state.");
    }
}

public class Software20 implements Updatable20 {
    @Override
    public void update() {
        System.out.println("Updating software.");
    }
}

class Main20 {
    public static void main(String[] args) {
        Updatable20 app = new Software20();
        app.update(); // "Updating software." 출력
        app.reset();  // "Resetting to default state." 출력
    }
} 