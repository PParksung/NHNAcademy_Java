package QUIZ.Quiz05.quiz0507;

// Quiz 5-7 문제 6
public interface Constants6 {
    int MAX_SPEED = 120;
    int MIN_SPEED = 10;
}

class Car6 implements Constants6 {
    public void displaySpeedRange() {
        // TODO: 상수를 사용하여 출력문을 작성하세요.
        System.out.println("Speed range: " + MIN_SPEED + " - " + MAX_SPEED);
    }
}

class Main6 {
    public static void main(String[] args) {
        Car6 car = new Car6();
        car.displaySpeedRange(); // "Speed range: 10 - 120" 출력
    }
} 