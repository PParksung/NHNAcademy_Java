package QUIZ.Quiz05.quiz0507;

// Quiz 5-7 문제 9: 인터페이스 확장
interface Flyable9 {
    void fly();
}

interface Hoverable9 extends Flyable9 {
    void hover();
}

public class Drone9 implements Hoverable9 {
    // TODO: fly()와 hover() 메서드를 구현하세요.
    @Override
    public void fly() {
        System.out.println("Drone is flying.");
    }
    @Override
    public void hover() {
        System.out.println("Drone is hovering.");
    }
}

class Main9 {
    public static void main(String[] args) {
        Hoverable9 drone = new Drone9();
        drone.fly();   // "Drone is flying." 출력
        drone.hover(); // "Drone is hovering." 출력
    }
} 