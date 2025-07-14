package QUIZ.Quiz05.quiz0506;

// Quiz 5-6 문제 8
class Vehicle8 {
    public void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car8 extends Vehicle8 {
    @Override
    public void start() {
        super.start(); // TODO: super를 사용하여 Vehicle의 start 메서드 호출
        System.out.println("Car is starting with advanced features.");
    }
}

public class Main8 {
    public static void main(String[] args) {
        Car8 car = new Car8();
        car.start();
        // Vehicle is starting.
        // Car is starting with advanced features.
    }
} 