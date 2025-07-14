package QUIZ.Quiz05.quiz0507;

// Quiz 5-7 문제 5
public interface Flyable5 {
    void fly();
}

class Bird5 implements Flyable5 {
    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }
}

class Airplane5 implements Flyable5 {
    @Override
    public void fly() {
        System.out.println("Airplane is flying.");
    }
}

class Main5 {
    public static void main(String[] args) {
        // TODO: Flyable 배열을 사용하여 다형적으로 fly()를 호출하세요.
        Flyable5[] flyers = new Flyable5[2];
        flyers[0] = new Bird5();
        flyers[1] = new Airplane5();
        for (Flyable5 flyer : flyers) {
            flyer.fly(); // 각 클래스에 맞는 메시지 출력
        }
    }
} 