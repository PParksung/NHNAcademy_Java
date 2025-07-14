package QUIZ.Quiz05.quiz0507;

// Quiz 5-7 문제 15: 기본 메서드 재정의
interface Movable15 {
    void move();
    default void stop() {
        System.out.println("Stopping...");
    }
}

public class Car15 implements Movable15 {
    @Override
    public void move() {
        System.out.println("Car is moving.");
    }
    @Override
    public void stop() {
        // TODO: 기본 메서드를 재정의하여 "Car is stopping." 출력
        System.out.println("Car is stopping.");
    }
}

class Main15 {
    public static void main(String[] args) {
        Car15 car = new Car15();
        car.move();  // "Car is moving." 출력
        car.stop();  // "Car is stopping." 출력
    }
} 