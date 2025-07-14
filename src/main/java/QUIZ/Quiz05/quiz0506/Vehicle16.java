package QUIZ.Quiz05.quiz0506;

// Quiz 5-6 문제 16
class Vehicle16 {
    public void move() {
        System.out.println("Vehicle is moving.");
    }
}

class Bike16 extends Vehicle16 {
    @Override
    public void move() {
        super.move(); // TODO: super를 사용하여 상속된 메서드 호출
        System.out.println("Bike is pedaling.");
    }
}

class Main16 {
    public static void main(String[] args) {
        Bike16 bike = new Bike16();
        bike.move();
        // Vehicle is moving.
        // Bike is pedaling.
    }
} 